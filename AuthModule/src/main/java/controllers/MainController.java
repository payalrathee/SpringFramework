package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.User;
import repositories.UserRepository;

@Controller
public class MainController {

	@RequestMapping(path="/")
	public String index(@ModelAttribute User user, HttpSession session) {
		
		user = (User) session.getAttribute("user");
		
		if(user != null) {
			return "redirect:/home";
		}
		
		return "index";
	}
	
	@RequestMapping(path="/home")
	public String home() {
		
		return "home";
	}

	@RequestMapping(path="/page")
	public String page() {
		
		return "page";
	}
	
	@RequestMapping(path="/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "redirect:/";
	}
}
