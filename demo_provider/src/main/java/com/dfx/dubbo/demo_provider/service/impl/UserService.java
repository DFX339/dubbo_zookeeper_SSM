package com.dfx.dubbo.demo_provider.service.impl;

import javax.annotation.Resource;

import com.dfx.dubbo.demo_interface.api.UserIService;
import com.dfx.dubbo.demo_interface.pojo.User;
import com.dfx.dubbo.demo_provider.mapper.UserMapper;

/**
 * 业务层接口方法实现类
 * @author Administrator
 *
 */
public class UserService implements UserIService {

	@Resource
	private UserMapper userDao;
	
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void edit(User user) {
		userDao.edit(user);
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

}
