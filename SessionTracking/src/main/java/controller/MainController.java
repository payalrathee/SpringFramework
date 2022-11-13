package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/signin")
	public String signin()
	{
		
		return "signin";
	}
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	@RequestMapping("/signinHandler")
	public String signinHandler(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session)
	{
		//verify email and pwd
		//if correct
		if(email.equals("abc@gmail.com") && password.equals("xyz"))
		{
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			return "redirect:welcome";
		}
		else
		{
			session.invalidate();
			return "redirect:signin";
		}
		
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "home";
	}

}
