package com.netbuilder.controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {

    @RequestMapping(value="/landing")
    public String greetingForm(Model model) {
        return "landing";
    }
}