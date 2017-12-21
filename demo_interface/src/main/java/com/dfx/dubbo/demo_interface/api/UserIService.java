package com.dfx.dubbo.demo_interface.api;

import com.dfx.dubbo.demo_interface.pojo.User;

/**
 * 业务方法接口设计
 * @author Administrator
 *
 */
public interface UserIService {

	public void add(User user);
	
	public void edit(User user);
	
	public User findById(int id);
	
	public void delete(int id);
}
