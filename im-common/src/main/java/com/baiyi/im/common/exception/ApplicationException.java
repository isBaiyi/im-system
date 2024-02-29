package com.baiyi.im.common.exception;

/**
 * @description: 全局异常
 * @author: liaozicai
 * @date: 2024/2/28 21:40
 */
public class ApplicationException extends RuntimeException {

	private final int code;

	private final String error;

	public ApplicationException(int code, String message) {
		super(message);
		this.code = code;
		this.error = message;
	}

	public ApplicationException(ApplicationExceptionEnum exceptionEnum) {
		super(exceptionEnum.getError());
		this.code = exceptionEnum.getCode();
		this.error = exceptionEnum.getError();
	}

	public int getCode() {
		return code;
	}

	public String getError() {
		return error;
	}


	/**
	 * avoid the expensive and useless stack trace for api exceptions
	 *
	 * @see Throwable#fillInStackTrace()
	 */
	@Override
	public Throwable fillInStackTrace() {
		return this;
	}

}
