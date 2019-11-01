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
	public String select() throws Exception {
		return "index";
	}

	@RequestMapping("/signUp.do")
	public String signUpPage() {
		return "signUp";
	}

	@RequestMapping("/login.do")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/register.do")
	public String registerPage() {
		return "register";
	}

	@RequestMapping(value = "/userInsert.do", method = RequestMethod.POST)
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

	@RequestMapping(value = "/getUserInfo.do", method = RequestMethod.POST )
	public ModelAndView welecomePost(ModelAndView mav, String user_id, HttpSession session) {
		UserDTO userDTO = new UserDTO();
		if(session.getAttribute("user_id") != null) {
			session.setAttribute("user_id", user_id);
			System.out.println("hello");
		}else {
			session.setAttribute("user_id", user_id);
		}
		userDTO = user.getUserInfo(user_id);
		if (userDTO != null) {
			mav.addObject("userDTO", userDTO);
			mav.setViewName("index");
		} else {
			mav.setViewName("login");
		}
		return mav;
	}
	@RequestMapping(value = "/getUserInfo.do", method = RequestMethod.GET )
	public ModelAndView welecomeGet(ModelAndView mav, HttpSession session) {
		UserDTO userDTO = new UserDTO();
		String user_id = (String) session.getAttribute("user_id");
		if( user_id != null) {
			userDTO = user.getUserInfo(user_id);
			mav.addObject("userDTO", userDTO);
			mav.setViewName("index");
		}else {
			mav.setViewName("login");
		}
		return mav;
	}

	@RequestMapping("/logout.do")
	public String logoutMethod(HttpSession session) {
		session.invalidate();
		return "login";
	}

	@RequestMapping("/charts.do")
	public String showChartMethod() {
		return "charts";
	}

}
