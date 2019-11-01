package service;

import java.util.List;

import dto.UserDTO;

public interface UserService {
	public List<UserDTO> selectUser() throws Exception;
	public void userInsertMethod(UserDTO userInfo);
	public UserDTO getUserInfo(String user_id);
}
