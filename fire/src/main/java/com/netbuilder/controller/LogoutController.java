package com.netbuilder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author rluu
 */

@Controller
public class LogoutController {

	@RequestMapping("Logout")
	public String Logout (HttpSession session){
		session.removeAttribute("sessionUser");
		System.out.println("log out");
		return "redirect:/";
		
	}
}
