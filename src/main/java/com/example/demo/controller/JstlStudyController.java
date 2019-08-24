package com.example.demo.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.AudienceRatingDto;
import com.example.demo.service.DbMockService;

@Controller
public class JstlStudyController {

    @Autowired
    private DbMockService dbMockService;

    @RequestMapping(path = "/audienceRating")
    public String index(HttpServletRequest request) {

        ArrayList<AudienceRatingDto> result = dbMockService.read();

        request.setAttribute("audienceRatingDtoList", result);

        return "AudienceRating";
    }
}
