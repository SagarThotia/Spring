package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
@RequestMapping("/second")
public class ContactController 
{
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","Registeration Form");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding common data to model");
	}
	
	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm(Model m) 
	{
		System.out.println("Creating form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,  Model model) 
	{
	
		System.out.println(user);
		
		if(user.getUsername().isBlank())
		{
			return "redirect:/contact";
		}
		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","User created with id " + createdUser);
		return "success";
	}

	
//	  @RequestMapping(path="/processform", method=RequestMethod.POST) 
//	  public String handleForm(@RequestParam(name = "email", required= true) String
//	  email, @RequestParam("username") String username, @RequestParam("password")
//	  String password, Model model ) 
//	  { 
//	  System.out.println("user email: " + email);
//	  System.out.println("user name: " + username);
//	  System.out.println("user password: " + password); 
//	  System.out.println();
//	  
//	  User user = new User(); 
//	  user.setEmail(email); 
//	  user.setUsername(username);
//	  user.setPassword(password);
//	  
//	  System.out.println(user);
//	  
//	  model.addAttribute(user);
//	  
//	  
//	  
//	  //process
//	  
//		/*
//		 * model.addAttribute("name", username); model.addAttribute("email", email);
//		 * model.addAttribute("password", password);
//		 */
//	  
//	  return "success"; 
//	  }
	 
}
