package com.netbuilder.contoller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Product;

@Controller
public class JSPController {
	 @RequestMapping("/")
	    public String index(ModelAndView modelAndView) {
	        return "index";
	  }
	 
	 
	 	
}