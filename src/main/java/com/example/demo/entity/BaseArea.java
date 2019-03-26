package com.example.demo.entity;

public class BaseArea {
    private String areaCode;

    private String areaName;

    private String shortAreaName;

    private String areaParentcode;

    private String areaLevel;

    private String areaDescript;

    private String areaLng;

    private String areaLat;

    private Integer areaSort;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getShortAreaName() {
        return shortAreaName;
    }

    public void setShortAreaName(String shortAreaName) {
        this.shortAreaName = shortAreaName == null ? null : shortAreaName.trim();
    }

    public String getAreaParentcode() {
        return areaParentcode;
    }

    public void setAreaParentcode(String areaParentcode) {
        this.areaParentcode = areaParentcode == null ? null : areaParentcode.trim();
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel == null ? null : areaLevel.trim();
    }

    public String getAreaDescript() {
        return areaDescript;
    }

    public void setAreaDescript(String areaDescript) {
        this.areaDescript = areaDescript == null ? null : areaDescript.trim();
    }

    public String getAreaLng() {
        return areaLng;
    }

    public void setAreaLng(String areaLng) {
        this.areaLng = areaLng == null ? null : areaLng.trim();
    }

    public String getAreaLat() {
        return areaLat;
    }

    public void setAreaLat(String areaLat) {
        this.areaLat = areaLat == null ? null : areaLat.trim();
    }

    public Integer getAreaSort() {
        return areaSort;
    }

    public void setAreaSort(Integer areaSort) {
        this.areaSort = areaSort;
    }
}