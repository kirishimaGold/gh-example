package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.JstlStudyService;

@Controller
public class JstlStudyController {

    private JstlStudyService jstlStudyService;

    @RequestMapping(path = "/jstl-study")
    public String index(HttpServletRequest request) {

        return "JstlStudy";
    }
}
