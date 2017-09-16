package com.dynamicmenu.core;

import org.springframework.web.servlet.ModelAndView;

import com.dynamicmenu.utils.MenuGenerator;

public class DefaultBeansForController {

	public static ModelAndView getInitializedModel(String name) {

		ModelAndView model = new ModelAndView(name);

		model.addObject("message", "Wlecome to Home Page");
		model.addObject("menu", MenuGenerator.getMenu());

		return model;
	}
}
