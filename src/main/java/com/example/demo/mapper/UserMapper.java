package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.dto.user.request.UserRegisterDto;
import com.example.demo.dto.user.response.UserProfileDto;

@Component
@Mapper
public interface UserMapper {
    void create(@Param("dto") UserRegisterDto dto);

    UserProfileDto read(@Param("user_id") String userId);
}
