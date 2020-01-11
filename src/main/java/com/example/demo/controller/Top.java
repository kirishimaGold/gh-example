package com.example.demo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserDto;
import com.example.demo.service.TopService;

@Controller
public class Top {

    @Autowired
    private TopService topService;

    @RequestMapping(path = "/")
    public String index(HttpServletRequest request) {
        request.setAttribute("key", "value");

        /*
        UserDto userDto = new UserDto();
        userDto.setName("桐島");
        userDto.setMail("aaa@gmail.com");
        userDto.setTel("080-1111-2222");
         */

        UserDto userDto = topService.read();

        request.setAttribute("userDto", userDto);

        request.setAttribute("display", "テスト");
        return "Top";
    }

}

