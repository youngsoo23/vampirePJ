package dao;

import java.util.List;

import dto.UserDTO;

public interface UserDAO {
	public List<UserDTO> select() throws Exception;
}
