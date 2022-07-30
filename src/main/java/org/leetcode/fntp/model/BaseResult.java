package org.leetcode.fntp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * 
 * @author fntp
 *
 * @param <T>
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResult<T> implements Serializable {
	private static final long serialVersionUID = 2935077134269743857L;
	/** 响应码 成功 关注响应内容data **/
	public static final int RESPONSE_CODE_SUCCESS = 200;
	
	/** 响应码 失败 未登录 **/
	public static final int RESPONSE_CODE_UNLOGIN = 10001;
	
	/** 响应码 失败 登录失效 **/
	public static final int RESPONSE_CODE_INVALID_TOKEN = 10002;
	
	/** 响应码 失败 通用参数校验异常码 **/
	public static final int RESPONSE_CODE_ARG_NOT_VALID = 20001;
	
	/** 响应码 失败 关注失败信息 message 服务器异常 **/
	@Deprecated
	public static final int RESPONSE_CODE_FAILURE_DEP = 99999;
	
	/** 响应码 失败 关注失败信息 message 服务器内部异常 **/
	public static final int RESPONSE_CODE_FAILURE = 90000;
	/**
	 * 状态码
	 */
	private Integer code = RESPONSE_CODE_SUCCESS;
	/**
	 * 响应信息
	 */
	private String message;
	/**
	 * 响应内容
	 */
	private T data;

	/**
	 * 构建成功响应结果
	 * @param data 传入一个对象
	 */
	public BaseResult(T data) {
		super();
		this.code = RESPONSE_CODE_SUCCESS;
		this.message = "";
		this.data = data;
	}

	/**
	 * 封装的成功响应代码
	 * @param data 自定义类型的数据
	 * @param message 返回的消息
	 * @return 返回一个基础的结果
	 */
	public BaseResult<Object> success(Object data, String message){
		return BaseResult.builder ().code(RESPONSE_CODE_SUCCESS).data (data).message (message).build ();
	}

	/**
	 * 封装的成功响应代码
	 * @param data 自定义类型的数据
	 * @return 返回一个基础的结果
	 */
	public BaseResult<Object> success(Object data){
		return BaseResult.builder ().code(RESPONSE_CODE_SUCCESS).data (data).message ("successful").build ();
	}

	/**
	 * 封装的成功响应代码
	 * @param data 自定义类型的数据
	 * @param message 返回的消息
	 * @return 返回一个基础的结果
	 */
	public BaseResult<Object> error(Object data, String message){
		return BaseResult.builder ().code(RESPONSE_CODE_FAILURE).data (data).message (message).build ();
	}

	/**
	 * 封装的成功响应代码
	 * @param data 自定义类型的数据
	 * @return 返回一个基础的结果
	 */
	public BaseResult<Object> error(Object data){
		return BaseResult.builder ().code(RESPONSE_CODE_FAILURE).data (data).message ("error").build ();
	}
}
