package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AudienceRatingDto;

@Service
public class DbMockService {

    public ArrayList<AudienceRatingDto> read() {

        ArrayList<AudienceRatingDto> resList = new ArrayList<AudienceRatingDto>();

        {
            AudienceRatingDto audienceRatingDto = new AudienceRatingDto();
            audienceRatingDto.setProgramName("真実はいつもひとつ　名探偵コナン");
            audienceRatingDto.setDay("1");
            audienceRatingDto.setTime("20:00");
            audienceRatingDto.setHouseAudienceRate(12.0);
            audienceRatingDto.setAllAudienceRate(10.11);
            audienceRatingDto.setAired(true);
            resList.add(audienceRatingDto);
        }
        {
            AudienceRatingDto audienceRatingDto = new AudienceRatingDto();
            audienceRatingDto.setProgramName("朝ドラ");
            audienceRatingDto.setDay("0");
            audienceRatingDto.setTime("7:45");
            audienceRatingDto.setHouseAudienceRate(14.0);
            audienceRatingDto.setAllAudienceRate(15.20);
            audienceRatingDto.setAired(true);
            resList.add(audienceRatingDto);
        }
        {
            AudienceRatingDto audienceRatingDto = new AudienceRatingDto();
            audienceRatingDto.setProgramName("マツコの知らない世界");
            audienceRatingDto.setDay("1");
            audienceRatingDto.setTime("8:57");
            audienceRatingDto.setHouseAudienceRate(16.0);
            audienceRatingDto.setAllAudienceRate(13.3);
            audienceRatingDto.setAired(false);
            resList.add(audienceRatingDto);
        }
        {
            AudienceRatingDto audienceRatingDto = new AudienceRatingDto();
            audienceRatingDto.setProgramName("昼ドラ");
            audienceRatingDto.setDay("6");
            audienceRatingDto.setTime("12:45");
            audienceRatingDto.setHouseAudienceRate(10.0);
            audienceRatingDto.setAllAudienceRate(5);
            audienceRatingDto.setAired(true);
            resList.add(audienceRatingDto);
        }
        {
            AudienceRatingDto audienceRatingDto = new AudienceRatingDto();
            audienceRatingDto.setProgramName("人志松本のすべらない話");
            audienceRatingDto.setDay("6");
            audienceRatingDto.setTime("21:00");
            audienceRatingDto.setHouseAudienceRate(18.0);
            audienceRatingDto.setAllAudienceRate(12.7);
            audienceRatingDto.setAired(false);
            resList.add(audienceRatingDto);
        }

        return resList;
    }

}
