package com.springmvcFormDisplay2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	@RequestMapping("/")
	public String startPage() {
		return "Main-Page";
	}
}
