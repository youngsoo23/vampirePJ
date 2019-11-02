package dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dto.BloodPressureDTO;
import dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<UserDTO> select() throws Exception {
		 return sqlSession.selectList("user.selectUser");
	}

	@Override
	public void userInsertMethod(UserDTO userInfo) {
		sqlSession.insert("user.userInput", userInfo);
	}

	@Override
	public UserDTO getUserInfo(String user_id) {
		return sqlSession.selectOne("user.userInfo",user_id);
	}

	@Override
	public void insertRecordMethod(BloodPressureDTO bpDTO) {
		sqlSession.insert("user.insertRecord", bpDTO);
	}
	
	@Override
	public List<BloodPressureDTO> userRecord(String user_id) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("user.userRecord", user_id);
	}
}
