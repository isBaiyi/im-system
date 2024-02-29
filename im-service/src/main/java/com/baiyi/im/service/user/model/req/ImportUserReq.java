package com.baiyi.im.service.user.model.req;

import com.baiyi.im.common.model.RequestBase;
import com.baiyi.im.service.user.dao.ImUserDataEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description: 导入用户数据请求体
 * @author: liaozicai
 * @date: 2024/2/29 11:14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ImportUserReq  extends RequestBase {
	/** 用户数据 */
	private List<ImUserDataEntity> userData;
}
