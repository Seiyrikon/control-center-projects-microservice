package com.example.microservice.dao;
import org.apache.ibatis.annotations.Mapper;

import com.example.microservice.model.UserInfo;

@Mapper
public interface UserDao {
    UserInfo getUserById(String id);
}