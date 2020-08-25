package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		String msg="Welcome To Spring4 MVC!";
		return new ModelAndView("helloPage", "message", msg);
	}
}
