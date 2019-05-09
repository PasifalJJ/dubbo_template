package com.literary.userServiceImpl;


import com.literary.mapper.UserMapper;

import com.literary.model.User;
import com.literary.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void registerUser(User user) {
        User user1 = userMapper.selectByPrimaryKey(user.getId());
        if (user1==null){
            int i = userMapper.updateByPrimaryKey(user);
        }
    }
}
