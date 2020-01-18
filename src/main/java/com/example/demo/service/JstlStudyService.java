package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.dto.JstlStudyContents;
import com.example.demo.dto.JstlStudyDto;

@Service
public class JstlStudyService {

    public JstlStudyDto read() {
        // 外側の入れ物
        JstlStudyDto dto = new JstlStudyDto();
        // 内側のれもの
        List<JstlStudyContents> contentsList =
                new ArrayList<JstlStudyContents>();

        // 内側の入れ物の具材
        JstlStudyContents contents1 = new JstlStudyContents();
        JstlStudyContents contents2 = new JstlStudyContents();
        JstlStudyContents contents3 = new JstlStudyContents();

        contents1.setTitle("東京＊＊＊＊＊ンド・エレクトリカルパレード・ドリームライ");
        contents1.setImageUrl("img/parade.png");
        contents1.setType("1");
        contents1.setDiplayFlag(true);

        contents2.setTitle("デコレーション/フォトケーション");
        contents2.setImageUrl("img/tree.png");
        contents2.setType("2");
        contents2.setDiplayFlag(false);

        contents3.setTitle("クリスマスバージョンのアトラクション");
        contents3.setImageUrl("img/xver.png");
        contents3.setType("3");
        contents3.setDiplayFlag(true);

        contentsList.add(contents1);
        contentsList.add(contents2);
        contentsList.add(contents3);

        dto.setContents(contentsList);
        dto.setMiddleMessage("2019年11月8日(金)〜12月25日(水)<br />" +
                "＊＊ズ＊ーならではのファンタジックで楽しいクリスマス！");
        return dto;
    }
}