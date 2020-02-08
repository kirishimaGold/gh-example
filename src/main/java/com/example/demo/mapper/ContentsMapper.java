package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import com.example.demo.dto.contents.request.PostContentsDto;

@Component
@Mapper
public interface ContentsMapper {
    void create(
            @Param("dto")
            PostContentsDto dto
    );
}
