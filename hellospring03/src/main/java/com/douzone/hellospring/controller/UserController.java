package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/* 클래스 (타입) + 핸들러 (메소드) */

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		System.out.println(name);
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required=true,defaultValue="jy") String name,
						  @RequestParam(value="a", required=true,defaultValue="0") int age) {
		System.out.println(name);
		System.out.println(age);
		return "UserController.update2()";
	}
}
