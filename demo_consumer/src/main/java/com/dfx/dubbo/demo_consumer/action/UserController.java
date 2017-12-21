package com.dfx.dubbo.demo_consumer.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dfx.dubbo.demo_interface.api.UserIService;
import com.dfx.dubbo.demo_interface.pojo.User;

/**
 * 前端控制类
 * @author Administrator
 *
 */
@Controller
public class UserController {
	
	@Resource
	private UserIService userService;
	
	@RequestMapping("/add")
	public String add(User user){
		userService.add(user);
		return "main";
	}
	
	@RequestMapping("/delete")
	public String delete(int id){
		userService.delete(id);
		return "main";
	}
	
	@RequestMapping("/edit")
	public String edit(User user){
		userService.edit(user);
		return "main";
	}
	
	@RequestMapping("/find")
	public String find(int id,HttpServletRequest request){
		User user = userService.findById(id);
		System.out.println(user+"--"+user.getPassword()+user.getUsername()+user.getAge());
		request.setAttribute("user", user);
		return "main";
	}
	
}
