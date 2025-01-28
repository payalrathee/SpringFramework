package controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import beans.User;
import services.UserService;
import services.ValidationService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute User user, BindingResult result, Model model, HttpSession session) {
		
		
		try {
			
			if(result.hasErrors()) {
				return "index";
			}
			
			user = userService.registerUser(user);
			
			//Auto login
			session.setAttribute("user", user);
			
		} catch(Exception e) {
			System.out.println(e);
			
			if(e.getMessage().equals("EmailAlreadyExists")) {
				model.addAttribute("registerError", "Email already exists");
			} else if(e.getMessage().equals("UsernameAlreadyExists")) {
				model.addAttribute("registerError", "Username already exists");
			}
			
			return "index";
		}
		
		return "redirect:/home";
		
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute User user, Model model, HttpSession session) {
		
		try {
			
			String login = user.getUsername();
			String password = user.getPassword();
			
			if(login.isBlank() || password.isBlank()) {
				model.addAttribute("loginError", "Required fields can't be empty");
				return "index";
			}
			
			user = userService.validate(login, password);
			
			//Auto login
			session.setAttribute("user", user);
			
			
		} catch(Exception e) {
			System.out.println(e);
			
			if(e.getMessage().equals("UserNotFound")) {
				model.addAttribute("loginError", "User doen't exist");
			} else if(e.getMessage().equals("InvalidPassword")) {
				model.addAttribute("loginError", "Invalid password");
			}
			
			return "index";
		}
		
		return "redirect:/home";
	}

}
