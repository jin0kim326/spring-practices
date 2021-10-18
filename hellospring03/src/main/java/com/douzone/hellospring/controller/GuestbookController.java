package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * RequestMapping 메소드 단독 매
 * */
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	//url매핑을 메소드 이름으로 대체함 (/guestbook/list) 
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestbookController.delete()";
	}
}
