package com.iqmsoft.mm.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping(value = "/errorpage")
	public String errorpage() {
		return "errorpage";
	}

}
