package com.jsp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {
	
	@RequestMapping(value="/")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		//page to go to
		view.setViewName("index.jsp");
		//$variable , value of variable
		view.addObject("title", "JPSTEST");
		view.addObject("dr","9th Doctor");
		return view;

	}
	
	@RequestMapping(value="post" ,method = RequestMethod.POST)
	public void getDownloadPage(HttpServletRequest request, HttpServletResponse response) {
			String name = request.getParameter("fname");
			String lname = request.getParameter("lname");
			try {
				PrintWriter write = response.getWriter();
				write.print(name);
				write.print(lname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}

