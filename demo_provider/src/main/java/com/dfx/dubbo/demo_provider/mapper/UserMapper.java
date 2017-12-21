package com.dfx.dubbo.demo_provider.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.dfx.dubbo.demo_interface.pojo.User;

@MapperScan
public interface UserMapper {

	public void add(User user);
	
	public void edit(User user);
	
	public User findById(int id);
	
	public void delete(int id);
}
