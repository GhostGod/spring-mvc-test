package com.xxx.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("a")
	public String index(){
		return "index";
	}
	@RequestMapping("b")
	public String test(){
		return "test";
	}
}
