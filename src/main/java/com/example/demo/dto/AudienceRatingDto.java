package com.example.demo.dto;

public class AudienceRatingDto {

    private String programName;

    private String day;

    private String time;

    private double houseAudienceRate;

    private double allAudienceRate;

    private boolean isAired;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        switch (day) {
        case "0":
            this.day = "月曜";
            break;
        case "1":
            this.day = "火曜";
            break;
        case "2":
            this.day = "水曜";
            break;
        case "3":
            this.day = "木曜";
            break;
        case "4":
            this.day = "金曜";
            break;
        case "5":
            this.day = "土曜";
            break;
        case "6":
            this.day = "日曜";
            break;
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getHouseAudienceRate() {
        return houseAudienceRate;
    }

    public void setHouseAudienceRate(double houseAudienceRate) {
        this.houseAudienceRate = houseAudienceRate;
    }

    public double getAllAudienceRate() {
        return allAudienceRate;
    }

    public void setAllAudienceRate(double allAudienceRate) {
        this.allAudienceRate = allAudienceRate;
    }

    public boolean isAired() {
        return isAired;
    }

    public void setAired(boolean isAired) {
        this.isAired = isAired;
    }
}
