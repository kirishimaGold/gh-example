package com.example.demo.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ContactDto;
import com.example.demo.service.DbMockService2;

@Controller
public class JstlStudyController {

    @Autowired
    private DbMockService2 dbMockService2;

    @RequestMapping(path = "/jstl-study")
    public String index(HttpServletRequest request) {

        ArrayList<ContactDto> contactDtoList = dbMockService2.read();
        request.setAttribute("contactDtoList", contactDtoList);

        return "JstlStudy";
    }
}
