package dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO {
	@Inject
	private SqlSession sqlSession;

	

	@Override
	public List<UserDTO> select() throws Exception {
		// TODO Auto-generated method stub
		 return sqlSession.selectList("user.selectUser");
	}
}
