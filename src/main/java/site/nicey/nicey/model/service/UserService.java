package site.nicey.nicey.model.service;

import com.ssafy.board.model.dto.User;

import java.util.List;

public interface UserService {

//	public abstract List<User> getUserList(); //아래와 동일
	List<User> getUserList();

	int signup(User user);

	User login(User user);
	
}