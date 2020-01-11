package com.example.demo.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.user.response.UserProfileDto;
import com.example.demo.service.user.ProfileService;

@Controller
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @RequestMapping(path = "/user/profile")
    public String index(HttpServletRequest request, @RequestParam("user_id") String userId) {

        UserProfileDto dto = profileService.read(userId);
        request.setAttribute("userProfileDto", dto);
        return "user/Profile";
    }
}
