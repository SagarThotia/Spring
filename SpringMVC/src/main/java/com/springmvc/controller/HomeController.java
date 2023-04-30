//Step-4 : Controller
package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController 
{
   	   @RequestMapping(path="/home",method=RequestMethod.GET)	
	   public String home(Model model)
	   {
		   System.out.println("This is home url");
		   model.addAttribute("name","Albina Peposhi");
		   model.addAttribute("id",200);
		   List<String> friends = new ArrayList<String>();
		   friends.add("Jayesh");
		   friends.add("Tanishq");
		   friends.add("Rahul");
		   friends.add("Arshad");
		   friends.add("Vijay");
		   friends.add("Sagar");	
		   model.addAttribute("f", friends);
		   return "index";
	   }
   	   
   	   @RequestMapping("/about")	
	   public String about()
	   {
		   System.out.println("This is about url");
		   return "about";
	   }
   	   
       @RequestMapping("/services")	
	   public String services()
	   {
		   System.out.println("This is services url");
		   return "services";
	   }
   	   
       
       @RequestMapping("/help")	//handler method
	   public ModelAndView help()
	   {
		   System.out.println("This is help url");
		   
		   //creating model and view object
		   ModelAndView modelAndView = new ModelAndView();
		   
		   //setting the data
		   modelAndView.addObject("name","Jennifer Matson");
		   modelAndView.addObject("rollno", 100);
		   LocalDateTime now = LocalDateTime.now();
		   modelAndView.addObject("time", now);
		   
		   //marks
		   List<Integer> list = new ArrayList<Integer>();
		   list.add(12);
		   list.add(3434);
		   list.add(2134);
		   list.add(2345);
		   list.add(900909);
		   modelAndView.addObject("marks", list);	
		   
		   //setting the view Page
		   modelAndView.setViewName("help");
		   return modelAndView;
	   }
}
