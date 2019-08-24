package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetSampleController {

    @RequestMapping(path = "/getsample")
    public String index(HttpServletRequest request, @RequestParam("id") String id) {
        request.setAttribute("id", id);
        return "GetSample";
    }
}
