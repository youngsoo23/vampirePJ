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
		// TODO Auto-generated method stub
		return dao.select();
	}
}
