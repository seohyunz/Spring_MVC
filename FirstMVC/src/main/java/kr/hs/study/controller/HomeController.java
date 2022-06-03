package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@GetMapping("/")
	//@RequestMapping(value ="/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	//get방식으로 /test접속했을때 콘솔에 test출력
	/*
	 * @RequestMapping(value ="/", method = RequestMethod.GET) public String test()
	 * { System.out.println("test"); return null; }
	 */
	
}
