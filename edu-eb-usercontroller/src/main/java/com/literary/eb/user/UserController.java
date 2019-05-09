package com.literary.eb.user;

import com.literary.model.User;
import com.literary.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ebUser")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUserById")
    public @ResponseBody User findUserById(Integer id){
        System.out.println("id = " + id);
        System.out.println("userService = " + userService);
        User userById = userService.findUserById(id);
        System.out.println("user ==== " + userById);
        return userById;
    }
}
