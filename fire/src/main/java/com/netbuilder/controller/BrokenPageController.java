package com.netbuilder.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BrokenPageController implements ErrorController{

    private static final String PATH = "/BrokenPage";

    @RequestMapping(value = PATH)
    public String error(ModelAndView modelAndView) {
        return "BrokenPage";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}