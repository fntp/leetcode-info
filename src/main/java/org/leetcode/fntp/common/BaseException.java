package org.leetcode.fntp.common;

/**
 * 异常基类
 *
 * @author fntp
 * @since 2020/03/05
 */
public class BaseException extends RuntimeException {

    /**
     * 状态码
     */
    private final int code;

    public BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public BaseException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }

    public BaseException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.code = codeEnum.getCode();
    }

    public BaseException(Exception e) {
        super(e);
        this.code = CodeEnum.FAILED.getCode();
    }

    public BaseException(CodeEnum codeEnum, String... msg) {
        super(String.format(codeEnum.getMessage(), msg));
        this.code = codeEnum.getCode();
    }

    public int getCode() {
        return code;
    }

}
