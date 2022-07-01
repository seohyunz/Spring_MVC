package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	//1부터 10까지의 합
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public String test1() {
		return "result";
	}
	
	
	
}
