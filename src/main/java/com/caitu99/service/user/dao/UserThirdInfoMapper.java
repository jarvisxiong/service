package com.caitu99.service.user.dao;


import com.caitu99.service.user.domain.UserThirdInfo;
import com.caitu99.platform.dao.base.func.IEntityDAO;

public interface UserThirdInfoMapper extends IEntityDAO<UserThirdInfo, UserThirdInfo> {
	int deleteByPrimaryKey(Long id);

	int insert(UserThirdInfo record);

	int insertSelective(UserThirdInfo record);

	UserThirdInfo selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(UserThirdInfo record);

	int updateByPrimaryKey(UserThirdInfo record);

	UserThirdInfo selectByUserId(Long userId);

	void updateByuserid(UserThirdInfo userThirdInfo);

}