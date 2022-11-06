package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import beans.User;

@Controller
@RequestMapping("/springMVC")
public class Controller1 {
	@ModelAttribute
	public void common(Model model)
	{
		model.addAttribute("heading","MySpringMVCProject");
		model.addAttribute("desc","Learning Spring MVC...");
	}
	@RequestMapping("/form")
	public String form()
	{
		return "complexForm";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Payal");
		model.addAttribute("id",10202);
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("heading","About Us Page");
		mv.addObject("content","Learning Spring MVC...");
		mv.setViewName("about");
		return mv;
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}

//Approach : 1	
//	@RequestMapping("/register")
//	public String register(HttpServletRequest request,Model model)
//	{
//		model.addAttribute("email",request.getParameter("email"));
//		model.addAttribute("pwd",request.getParameter("pwd"));
//		return "success";
//	}
	
//Approach : 2	
//	@RequestMapping("/register")
//	public String register(@RequestParam("email") String email,@RequestParam("pwd") String pwd,Model model)
//	{
//		model.addAttribute("email",email);
//		model.addAttribute("pwd",pwd);
//		return "success";
//	}
	
//Approach : 3
	@RequestMapping("/register")
	public String register(@ModelAttribute User user)
	{
		return "success";
	}

}
