package com.sts.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
    @ResponseBody
	public String handleRequest() {
		int a =10;
		int b=20;
		return "This is jus test"+ (b-a);
	}
	
	
	

}
