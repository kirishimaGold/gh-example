package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;

@Service
public class TopService {
    public UserDto read() {

        UserDto userDto = new UserDto();
        userDto.setName("桐島");
        userDto.setMail("aaa@gmail.com");
        userDto.setTel("080-1111-2222");

        return userDto;
    }
}
