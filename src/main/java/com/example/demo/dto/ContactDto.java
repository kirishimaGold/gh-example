package com.example.demo.dto;

public class ContactDto {
    private String title;
    private String content;
    private String ungency;
    private String limit;
    private String drafter;
    private String status;
    private String responser;
    private String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUngency() {
        return ungency;
    }

    public void setUngency(String ungency) {
        if (ungency == "0") {
            this.ungency = "低";
        } else if (ungency == "1") {
            this.ungency = "中";
        } else if (ungency == "2") {
            this.ungency = "高";
        }

    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getDrafter() {
        return drafter;
    }

    public void setDrafter(String drafter) {
        this.drafter = drafter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == "0") {
            this.status = "対応中";
        } else if (status == "1") {
            this.status = "完了";
        } else if (status == "2") {
            this.status = "取下";
        }
    }

    public String getResponser() {
        return responser;
    }

    public void setResponser(String responser) {
        this.responser = responser;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == "0") {
            this.category = "ネットワーク";
        } else if (category == "1") {
            this.category = "アプリ";
        }
    }

}
