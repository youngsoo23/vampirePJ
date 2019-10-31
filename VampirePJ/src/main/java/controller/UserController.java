package controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@Controller
public class UserController {
	@Inject
	private UserService user;
	
	@RequestMapping("/select")
	public String select() throws Exception{
		System.out.println(user.selectUser().size());
		return "home";
	}
}
