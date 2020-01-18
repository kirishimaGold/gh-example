package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dto.JstlStudyDto;
import com.example.demo.service.JstlStudyService;

@Controller
public class JstlStudyController {

    @Autowired
    private JstlStudyService jstlStudyService;

    @RequestMapping(path = "/jstl-study")
    public String index(HttpServletRequest request) {

        JstlStudyDto dto = jstlStudyService.read();
        request.setAttribute("dto", dto);

        return "JstlStudy";
    }
}