package com.example.demo.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.user.response.UserProfileDto;
import com.example.demo.mapper.UserMapper;

@Service
public class ProfileService {

    @Autowired
    UserMapper userMapper;

    public UserProfileDto read(String userId) {

        return userMapper.read(userId);
    }
}
