package com.netbuilder.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entityrepositories.AddressRepository;



@Controller
public class AddressController {
	
	@Autowired
	private AddressRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView printAddresses( ModelMap model ) {
		List addresses = repository.findAll();
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("Address", addresses);
		return modelAndView;
	}
}