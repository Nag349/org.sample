package org.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
public ModelAndView moves(){
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("ab");
	modelAndView.addObject("mess", "anything wrong");
	return modelAndView;
}
}
