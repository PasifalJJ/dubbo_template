package com.literary.userService;


import com.literary.model.User;

public interface UserService {
    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    User findUserById(Integer id);

    /**
     * 注册用户
     * @param user
     */
    void registerUser(User user);
}
