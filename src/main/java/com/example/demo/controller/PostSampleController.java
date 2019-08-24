package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserDto;

@Controller
public class PostSampleController {

    @RequestMapping(path = "/postsample", method = RequestMethod.POST)
    public String index(HttpServletRequest request, UserDto userDto) {
        request.setAttribute("userDto", userDto);
        return "PostSample";
    }
}

