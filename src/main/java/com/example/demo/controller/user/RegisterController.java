package com.example.demo.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.user.request.UserRegisterDto;
import com.example.demo.service.user.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping(path = "/user/index")
    public String index(HttpServletRequest request) {
        return "user/Register";
    }

    @RequestMapping(path = "/user/register", method = RequestMethod.POST)
    public String create(HttpServletRequest request, UserRegisterDto dto) {
        registerService.create(dto);
        return "user/RegisterComplete";
    }
}
