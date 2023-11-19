package site.nicey.model.service;

import site.nicey.model.dto.User;

public interface UserService {

    int signup(User user);

    User login(User user);
}
