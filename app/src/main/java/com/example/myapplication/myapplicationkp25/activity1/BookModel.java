package com.example.myapplication.myapplicationkp25.activity1;

public class BookModel {
    private String name;
    private String autor;
    private String year;
    private boolean needToShowMessage;
    private boolean isNeedToStartActivity;

    public BookModel() {
        name = "";
        autor = "";
        year = "";
    }

    public BookModel(String name, String type, String power) {
        this.name = name;
        this.autor = type;
        this.year = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isNeedToShowMessage() {
        return needToShowMessage;
    }

    public void setNeedToShowMessage(boolean needToShowMessage) {
        this.needToShowMessage = needToShowMessage;
    }

    public boolean isNeedToStartActivity() {
        return isNeedToStartActivity;
    }

    public void setNeedToStartActivity(boolean needToStartActivity) {
        isNeedToStartActivity = needToStartActivity;
    }
}