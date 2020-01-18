package com.example.demo.dto;

public class JstlStudyContents {
    private String imageUrl;
    private String title;
    private String type;
    private boolean diplayFlag;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDiplayFlag() {
        return diplayFlag;
    }

    public void setDiplayFlag(boolean diplayFlag) {
        this.diplayFlag = diplayFlag;
    }
}
