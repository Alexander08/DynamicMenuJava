package com.dynamicmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dynamicmenu.core.DefaultBeansForController;

@Controller
@RequestMapping("/")
public class AboutPageController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView firstOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
		model.addObject("message", "Wlecome to About Page");
		return model;
	}
}
