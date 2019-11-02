package dao;

import java.util.List;

import dto.BloodPressureDTO;
import dto.UserDTO;

public interface UserDAO {
	public List<UserDTO> select() throws Exception;
	public void userInsertMethod(UserDTO userInfo);
	public UserDTO getUserInfo(String user_id);
	public void insertRecordMethod(BloodPressureDTO bpDTO);
	public List<BloodPressureDTO> userRecord(String user_id);
}
