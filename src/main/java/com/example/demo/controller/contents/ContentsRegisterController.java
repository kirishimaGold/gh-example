package com.example.demo.controller.contents;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.dto.contents.request.PostContentsDto;
import com.example.demo.service.contents.ContentsRegisterService;

@Controller
public class ContentsRegisterController {

    @Autowired
    ContentsRegisterService service;

    @RequestMapping(path = "/contens/index")
    public String index(HttpServletRequest request) {
        return "contents/Register";
    }

    @RequestMapping(path = "/contents/regster", method = RequestMethod.POST)
    public String create(HttpServletRequest request, PostContentsDto dto) {
        service.create(dto);
        return "contents/RegisterComplete";
    }
}
