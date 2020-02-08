package com.example.demo.service.contents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.contents.request.PostContentsDto;
import com.example.demo.mapper.ContentsMapper;

@Service
public class ContentsRegisterService {
    @Autowired
    ContentsMapper mapper;

    public void create(PostContentsDto dto) {
        mapper.create(dto);
        return;
    }
}
