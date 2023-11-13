package site.nicey.nicey.model.dao;

import com.ssafy.board.model.dto.User;

import java.util.List;

public interface UserDao {

	List<User> selectAll();

	int insertUser(User user);
	
	User selectOne(String id);
	
}