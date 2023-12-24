package com.example.cloudcomputing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloudcomputing.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT userid,username,gender,age FROM `user`")
    @Results({
            @Result(column = "userid",property = "userid"),
            @Result(column = "username",property = "username"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "age",property = "age")
    })
    public List<User> selectAllUser();
}
