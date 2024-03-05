package com.example.mqdemo.controller;

import com.example.mqdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mqdemo.mapper.UserMapper;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper usermapper;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/user/login")
    public boolean query(String username,String password){

        List<User> list=usermapper.selectList(null);

        System.out.println(list);

        System.out.println(username+password);

        for(User user : list){
            if(user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    return true;
                }
            }
        }


        return false;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @PostMapping("/user/register")
    public boolean save(User user){

        int i= usermapper.insert(user);

        System.out.println(user);
        if(i>0){
            return true;
        }
        else{
            return false;
        }

/*        System.out.println(user);
        return "complete";*/

    }
}
