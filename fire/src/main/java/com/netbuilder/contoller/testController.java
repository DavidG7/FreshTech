package com.netbuilder.contoller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @Autowired
	TestControllerConfig tcc;

/*		@RequestMapping(value="/welcome")
		public ModelAndView helloWorld() {
	 
			String message = "<br><div style='text-align:center;'>"
					+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
			return new ModelAndView("welcome", "message", message);*/
    
	
	 @RequestMapping(value="/paymentagreement")
	 public String index(Model model) {
		 	model.addAttribute("checkoutitem", tcc.orderItems().get(0).toString() );
	        return "paymentagreement";
	 }
}