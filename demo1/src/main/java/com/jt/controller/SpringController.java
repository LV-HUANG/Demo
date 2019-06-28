package com.jt.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController  {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return"hello world";
	}
}
