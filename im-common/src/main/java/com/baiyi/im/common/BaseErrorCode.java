package com.baiyi.im.common;

import com.baiyi.im.common.exception.ApplicationExceptionEnum;

/**
 * @description: 基础异常信息
 * @author: liaozicai
 * @date: 2024/2/28 21:47
 */
public enum BaseErrorCode implements ApplicationExceptionEnum {
	SUCCESS(200, "success"),
	SYSTEM_ERROR(90000, "服务器内部错误,请联系管理员"),
	PARAMETER_ERROR(90001, "参数校验错误"),
	;

	private final int code;
	private final String error;

	BaseErrorCode(int code, String error) {
		this.code = code;
		this.error = error;
	}

	@Override
	public int getCode() {
		return this.code;
	}

	@Override
	public String getError() {
		return this.error;
	}
}
