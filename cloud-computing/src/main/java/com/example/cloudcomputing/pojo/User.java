package com.example.cloudcomputing.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer userid;
    private String username;
    private Integer gender;
    private Integer age;

//    @Override
//    public String toString() {
//        return "User{" +
//                "userid = " + userid +
//                ", username = " + username +
//                ", gender = " + gender +
//                ", age = " + age +
//                "}";
//    }
}
