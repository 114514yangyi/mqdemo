package com.example.mqdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mqdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User>{
//    @Select("select * from user")
//    public List<User> find();
//    @Insert("insert into user(username,password,birthdate) values(#{username},#{password},#{birthdate})")
//    public int insert(User user);
}
