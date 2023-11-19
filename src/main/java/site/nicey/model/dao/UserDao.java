package site.nicey.model.dao;

import site.nicey.model.dto.User;

public interface UserDao {


    int insertUser(User user);

    User selectUser(User user);
}
