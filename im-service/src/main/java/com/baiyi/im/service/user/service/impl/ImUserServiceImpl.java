package com.baiyi.im.service.user.service.impl;

import com.baiyi.im.service.user.dao.mapper.ImUserDataMapper;
import com.baiyi.im.service.user.service.ImUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 用户数据服务层
 * @author: liaozicai
 * @date: 2024/2/29 11:17
 */
@Service("imUserService")
public class ImUserServiceImpl implements ImUserService {

	@Resource
	private ImUserDataMapper imUserDataMapper;


}
