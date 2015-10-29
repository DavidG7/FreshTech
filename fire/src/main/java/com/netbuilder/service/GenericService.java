package com.netbuilder.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

public class GenericService {
	
	private Object userSession;
	
	public GenericService(HttpSession session, String sessionName){
		userSession = session.getAttribute(sessionName);
	}
	
	public boolean sessionExists(ModelAndView modelAndView){
		if(userSession==null){
			return false;
		}
		else{
			return true;
		}
	}

	public Object getUserSession() {
		return userSession;
	}

	public void setUserSession(Object userSession) {
		this.userSession = userSession;
	}
}
