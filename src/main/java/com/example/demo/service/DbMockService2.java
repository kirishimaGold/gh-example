package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactDto;

@Service
public class DbMockService2 {

    public ArrayList<ContactDto> read() {
        ArrayList<ContactDto> list = new ArrayList<ContactDto>();

        {
            ContactDto contactDto = new ContactDto();
            contactDto.setTitle("タイトル");
            contactDto.setContent("お問い合わせ内容をいっぱいかく");
            contactDto.setUngency("0");
            contactDto.setLimit("2019/8/30");
            contactDto.setDrafter("樺沢");
            contactDto.setStatus("0");
            contactDto.setResponser("桐島");
            contactDto.setCategory("0");
            list.add(contactDto);
        }
        {
            ContactDto contactDto = new ContactDto();
            contactDto.setTitle("タイトル2");
            contactDto.setContent("2お問い合わせ内容をいっぱいかく");
            contactDto.setUngency("1");
            contactDto.setLimit("2019/8/31");
            contactDto.setDrafter("すだ");
            contactDto.setStatus("2");
            contactDto.setResponser("きりしま");
            contactDto.setCategory("1");
            list.add(contactDto);
        }
        return list;
    }

}
