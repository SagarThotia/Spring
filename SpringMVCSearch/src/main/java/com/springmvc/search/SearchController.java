package com.springmvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController
{
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		
		String url="https://www.google.com/search?q="+query ;
		RedirectView redirectView = new RedirectView();
		
		//Add here condition to check field is empty or not.
		//If field is empty it redirect to currentPage(Home page home.jsp) 
		//if field is not empty it redirect user input url and show the user output
		if (query.isEmpty()) 
		{
			redirectView.setUrl("home");
			return redirectView;
		}
		
		redirectView.setUrl(url);		
		return redirectView;
	}
	
}
