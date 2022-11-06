package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping("/index")
	public String index()
	{
		int i=9/0;
		return "index";
	}
}
