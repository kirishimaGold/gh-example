package com.example.demo.dto;

import java.util.List;

public class JstlStudyDto {

    private String middleMessage;

    private List<JstlStudyContents> contents;

    public String getMiddleMessage() {
        return middleMessage;
    }

    public void setMiddleMessage(String middleMessage) {
        this.middleMessage = middleMessage;
    }

    public List<JstlStudyContents> getContents() {
        return contents;
    }

    public void setContents(List<JstlStudyContents> contents) {
        this.contents = contents;
    }

    /**
     * int foo[] = new int[3];
     *
     * void method() { contents.add(null); // 0番目はnull contents.add(null); // 1番目はnull
     * contents.add(null); // 2番目はnull
     *
     * foo[0] = 1; // 0番目は1 foo[1] = 100; // 1番目は100 foo[2] = 10000; // 2番目は10000 }
     **/
}
