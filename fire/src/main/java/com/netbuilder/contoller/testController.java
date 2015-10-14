package com.netbuilder.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	
	 @RequestMapping("form")
	    public String index(ModelAndView modelAndView) {
	        return "form";
	  }
}
