package controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.UserDTO;
import service.UserService;

@Controller
public class UserController {
	@Inject
	private UserService user;
	
	@RequestMapping("/Main")
	public String select() throws Exception{
		return "index";
	}
	
	@RequestMapping("/signUp.do")
	public String signUpPage() {
		return "signUp";
	}
	
	@RequestMapping("/login.do")
	public String loginPage() {
		return  "login";
	}
	
	@RequestMapping("/register.do")
	public String registerPage() {
		return  "register";
	}
	
	@RequestMapping(value="/userInsert.do", method=RequestMethod.POST)
	public ModelAndView signUp(UserDTO userInfo, ModelAndView mav, HttpSession session) {
		user.userInsertMethod(userInfo);
		UserDTO userDTO = new UserDTO();
		userDTO = user.getUserInfo(userInfo.getUser_id());
		session.setAttribute("user_id", userInfo.getUser_id());
		session.setAttribute("name", userDTO.getName());
		mav.addObject("userDTO", userDTO);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/getUserInfo.do", method=RequestMethod.POST)
	public ModelAndView welecome(ModelAndView mav, String user_id) {
		UserDTO userDTO = new UserDTO();
		userDTO = user.getUserInfo(user_id);
		if(userDTO != null) {
			mav.addObject("userDTO", userDTO);
			mav.setViewName("userInfo");
		}
		else {
			mav.setViewName("login");
		}
		return mav;
	}
}
