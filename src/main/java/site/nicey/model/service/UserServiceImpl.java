package site.nicey.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.nicey.model.dao.UserDao;
import site.nicey.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public int signup(User user){
        return userDao.insertUser(user);
    }

    @Override
    public User login(User user){
        User chk = userDao.selectUser(user);

        if (chk != null && chk.getLoginPassword().equals(user.getLoginPassword()))
            return chk;
        else
            return null;
    }
}
