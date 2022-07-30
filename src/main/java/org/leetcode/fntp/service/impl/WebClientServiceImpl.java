package org.leetcode.fntp.service.impl;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import org.leetcode.fntp.config.WebClientConfig;
import org.leetcode.fntp.service.IWebClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/31 0:06
 */
@Service("webClientServiceImpl")
public class WebClientServiceImpl implements IWebClientService {

    @Resource
    private WebClientConfig clientConfig;

    private WebClient getLocalWebClient(){
        // 默认以谷歌浏览器作为默认浏览器
        WebClient webClient = new WebClient (BrowserVersion.CHROME);
        // 打开JavaScript支持
        webClient.getOptions ().setJavaScriptEnabled (clientConfig.getEnableJavaScript ());
        // 打开Css支持
        webClient.getOptions ().setCssEnabled (clientConfig.getEnableCss ());
        return webClient;
    }

    @Override
    public String getUserInfoByDomainPageUrl(String domainPageUrl) {
        return null;
    }
}
