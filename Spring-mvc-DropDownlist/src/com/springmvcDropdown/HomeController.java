package com.springmvcDropdown;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This is the landing page controller
@Controller
public class HomeController {

		@RequestMapping("/")
		public String HomePage() {
			//home page router
			return "HomePage";
		}
		
}
