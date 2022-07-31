package org.leetcode.fntp.utils;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ConnectionPool;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.TlsVersion;
import org.apache.commons.net.util.TrustManagerUtils;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.leetcode.fntp.common.BaseException;
import org.leetcode.fntp.common.CodeEnum;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Http 工具类，提供内置的 HttpClient，若无特殊需求可以直接使用
 *
 * @author Guch
 */
@Slf4j
public class HttpUtil {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    /**
     * 构造方法
     */
    private HttpUtil() {
    }

    /**
     * 创建 HttpClient
     *
     * @param noSslVerify    是否跳过 SSL 认证，若传入 true 则需要同时设置正确的 tlsVersion，否则不生效
     * @param tlsVersion     TLS 版本，建议使用 okhttp3.TlsVersion.xxx.javaName()
     * @param connectionPool 连接池，传入 null 则使用 OkHttpClient.Builder 默认配置的连接池
     * @return HttpClient
     */
    public static OkHttpClient buildHttpClient(boolean noSslVerify, String tlsVersion, ConnectionPool connectionPool) {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            if (noSslVerify && Objects.nonNull(tlsVersion)) {
                TrustManager[] trustAllCerts = new TrustManager[] {TrustManagerUtils.getAcceptAllTrustManager()};
                final SSLContext sslContext = SSLContext.getInstance(tlsVersion);
                sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

                builder.sslSocketFactory(sslContext.getSocketFactory(), TrustManagerUtils.getAcceptAllTrustManager());
                builder.hostnameVerifier(NoopHostnameVerifier.INSTANCE);
            }
            if (Objects.nonNull(connectionPool)) {
                builder.connectionPool(connectionPool);
            }

            return builder.build();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new BaseException(CodeEnum.ERROR_HTTP.getCode(), "[buildHttpClient]方法失败，请检查 TLS 版本配置是否正确，[tlsVersion]=" +
                    tlsVersion, e);
        }
    }

    /**
     * 使用默认的 HttpClient 进行 GET 请求
     *
     * @param url       请求地址
     * @param params    请求参数
     * @param headerMap 请求头
     * @return 响应字符串
     * @throws IOException IO 异常
     */
    public static String get(String url, Map<String, String> params, Map<String, String> headerMap) throws IOException {
        return get(HttpClientHolder.HTTP_CLIENT, url, params, headerMap);
    }

    /**
     * 使用自定义的 HttpClient 进行 GET 请求
     *
     * @param httpClient http 客户端
     * @param url        请求地址
     * @param params     请求参数
     * @param headerMap  请求头
     * @return 响应字符串
     * @throws IOException IO 异常
     */
    public static String get(OkHttpClient httpClient, String url, Map<String, String> params,
                             Map<String, String> headerMap) throws IOException {
        Objects.requireNonNull(httpClient, "参数[httpClient]不可为空");
        if (Objects.nonNull(params) && params.size() > 0) {
            StringBuilder sb = new StringBuilder(url);
            sb.append("?");
            for (Map.Entry<String, String> entry : params.entrySet()) {
                sb.append(entry.getKey()).append("=")
                        .append(Objects.isNull(entry.getValue()) ? "" : entry.getValue()).append("&");
            }
            sb.deleteCharAt(sb.length() - 1);
            url = sb.toString();
        }
        log.info("[GET][url]{}[header]{}", url, headerMap);
        Request.Builder builder = getBuilder(url, headerMap);
        Request request = builder.get().build();
        return doCall(httpClient, request);
    }

    /**
     * 使用默认的 HttpClient 进行 application/json 形式的 POST 请求
     *
     * @param url       请求地址
     * @param json      Json 形式的请求体
     * @param headerMap 请求头
     * @return 响应字符串
     * @throws IOException IO 异常
     */
    public static String post(String url, String json, Map<String, String> headerMap) throws IOException {
        return post(HttpClientHolder.HTTP_CLIENT, url, json, headerMap);
    }

    /**
     * 使用自定义的 HttpClient 进行 application/json 形式的 POST 请求
     *
     * @param httpClient http 客户端
     * @param url        请求地址
     * @param json       Json 形式的请求体
     * @param headerMap  请求头
     * @return 返回内容
     */
    public static String post(OkHttpClient httpClient, String url, String json,
                              Map<String, String> headerMap) throws IOException {
        log.info("[JSON POST][url]{}[body]{}[header]{}", url, json, headerMap);
        return doPost(httpClient, url, RequestBody.create(JSON, Objects.isNull(json) ? "" : json), headerMap);
    }

    /**
     * 使用默认的 HttpClient 进行 FORM-DATA 形式的 POST 请求
     *
     * @param url       请求地址
     * @param params    key-value-pair 形式的请求体
     * @param headerMap 请求头
     * @return 响应字符串
     * @throws IOException IO 异常
     */
    public static String post(String url, Map<String, String> params,
                              Map<String, String> headerMap) throws IOException {
        return post(HttpClientHolder.HTTP_CLIENT, url, params, headerMap);
    }

    /**
     * 使用自定义的 HttpClient 进行 FORM-DATA 形式的 POST 请求
     *
     * @param httpClient http 客户端
     * @param url        URL
     * @param params     key-value-pair 形式的请求体
     * @param headerMap  请求头
     * @return 返回内容
     */
    public static String post(OkHttpClient httpClient, String url, Map<String, String> params,
                              Map<String, String> headerMap) throws IOException {
        log.info("[FORM POST][url]{}[body]{}[header]{}", url, params, headerMap);
        FormBody.Builder bodyBuilder = new FormBody.Builder();
        if (Objects.nonNull(params) && params.size() > 0) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                bodyBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        return doPost(httpClient, url, bodyBuilder.build(), headerMap);
    }

    private static Request.Builder getBuilder(String url, Map<String, String> headerMap) {
        Request.Builder builder = new Request.Builder().url(url);
        if (Objects.nonNull(headerMap) && headerMap.size() > 0) {
            for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                builder = builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return builder;
    }

    private static String doPost(OkHttpClient httpClient, String url, RequestBody body,
                                 Map<String, String> headerMap) throws IOException {
        Objects.requireNonNull(httpClient, "参数[httpClient]不可为空");
        Request.Builder builder = getBuilder(url, headerMap);
        Request request = builder.post(body).build();
        return doCall(httpClient, request);
    }

    private static String doCall(OkHttpClient httpClient, Request request) throws IOException {
        Response response = httpClient.newCall(request).execute();
        if (!response.isSuccessful()) {
            log.error(String.format("[doCall] execute error，code=%d，method=%s，url=%s",
                    response.code(), request.method(), request.url()));
            throw new BaseException (CodeEnum.ERROR_HTTP);
        }
        if (Objects.isNull(response.body())) {
            log.error(String.format("[doCall] execute error，[response.body()] is null，code=%d，method=%s，url=%s",
                    response.code(), request.method(), request.url()));
            throw new BaseException(CodeEnum.ERROR_HTTP);
        }
        String responseStr = response.body().string();
        log.info("[{} Success][url]{}[response]{}", request.method(), request.url(), responseStr);
        return responseStr;
    }

    private static class HttpClientHolder {
        // 1.跳过 HTTPS 请求的 SSL 认证
        // 2.使用自定义连接池，不缓存连接，在连接变为空闲时直接删除，及时释放资源
        public static final OkHttpClient HTTP_CLIENT = HttpUtil.buildHttpClient(true, TlsVersion.TLS_1_2.javaName(),
                new ConnectionPool(0, 1L, TimeUnit.SECONDS));
    }

}
