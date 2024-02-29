package com.baiyi.im.service.user.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description: 用户数据实体
 * @author: liaozicai
 * @date: 2024/2/29 10:16
 */
@Data
@TableName("im_user_data")
public class ImUserDataEntity {

	/** 用户id */
	@TableId
	private String userId;

	/** 用户名称 */
	private String nickName;

	/** 位置 */
	private String location;

	/** 生日 */
	private String birthDay;

	/** 密码 */
	private String password;

	/** 头像 */
	private String photo;

	/** 性别 */
	private Integer userSex;

	/** 个性签名 */
	private String selfSignature;

	/** 加好友验证类型（Friend_AllowType）1需要验证 */
	private Integer friendAllowType;

	/** 管理员禁止用户添加加好友：0 未禁用 1 已禁用 */
	private Integer disableAddFriend;

	/** 禁用标识(0 未禁用 1 已禁用) */
	private Integer forbiddenFlag;

	/** 禁言标识 */
	private Integer silentFlag;

	/** 用户类型 1普通用户 2客服 3机器人 */
	private Integer userType;

	/** 应用ID */
	private Integer appId;

	/** 删除标识 */
	private Integer delFlag;

	/** 扩展属性 */
	private String extra;

}

