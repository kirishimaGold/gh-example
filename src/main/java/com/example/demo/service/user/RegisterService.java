package com.example.demo.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.user.request.UserRegisterDto;
import com.example.demo.mapper.UserMapper;

@Service
public class RegisterService {

    @Autowired
    UserMapper userMapper;

    public void create(UserRegisterDto dto) {
        userMapper.create(dto);
        return;
    }
}
