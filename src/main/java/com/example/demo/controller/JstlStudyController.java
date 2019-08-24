package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DbMockService;

@Controller
public class JstlStudyController {

    @Autowired
    private DbMockService dbMockService;

    @RequestMapping(path = "/jstl-study")
    public String index(HttpServletRequest request) {

        return "JstlStudy";
    }
}
