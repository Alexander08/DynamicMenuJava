package com.dynamicmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dynamicmenu.core.DefaultBeansForController;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView firstOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
	
		return model;
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView homeOpen() {
		
		return firstOpen();
	}
	@RequestMapping(value = "item4", method = RequestMethod.GET)
	public ModelAndView somethingToTest() {
		
		ModelAndView model = firstOpen();
		
		model.addObject("message", "Wlecome to Item 4 Page");
		
		return model;
	}
}
