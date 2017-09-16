package com.dynamicmenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dynamicmenu.core.DefaultBeansForController;

@Controller
@RequestMapping("/learn")
public class LearnPageController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView firstOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
		model.addObject("message", "Wlecome to Learn Page");
		return model;
	}
	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public ModelAndView firstJavaOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
		model.addObject("message", "Wlecome to Learn Java Page");
		return model;
	}
	@RequestMapping(value = "/spring", method = RequestMethod.GET)
	public ModelAndView firstSpringOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
		model.addObject("message", "Wlecome to Learn Spring Page");
		return model;
	}
	@RequestMapping(value = "/smth", method = RequestMethod.GET)
	public ModelAndView firstSmthOpen() {

		ModelAndView model = DefaultBeansForController.getInitializedModel("HomePageView");
		model.addObject("message", "Wlecome to Learn Smth Page");
		return model;
	}
}
