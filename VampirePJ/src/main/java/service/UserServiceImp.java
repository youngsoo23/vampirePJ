package service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;
import dto.UserDTO;

@Service
public class UserServiceImp implements UserService{
	
	@Inject
	private UserDAO dao;
	
	@Override
	public List<UserDTO> selectUser() throws Exception {
		return dao.select();
	}
	@Override
	public void userInsertMethod(UserDTO userInfo) {
		dao.userInsertMethod(userInfo);
	}
	@Override
	public UserDTO getUserInfo(String user_id) {
		return dao.getUserInfo(user_id);
	}
}
