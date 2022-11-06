package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String search()
	{
		return "search";
	}
	@RequestMapping("/a")
	public String a()
	{
		return "a";
	}
	
	@RequestMapping("/searchHandler")
	public RedirectView searchHandler(@RequestParam("query") String query)
	{
		RedirectView rv=new RedirectView();
		if(query.equals(""))
		{
			rv.setUrl("search");
		}
		else
		{
			String url="https://www.google.com/search?q="+query;
			rv.setUrl(url);
		}
		return rv;
	}
}
