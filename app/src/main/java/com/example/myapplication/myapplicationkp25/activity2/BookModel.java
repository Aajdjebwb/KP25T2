package com.example.myapplication.myapplicationkp25.activity2;

public class BookModel {
    private String name;
    private String autor;
    private String year;

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

    public void setAutor(String type) {
        this.autor = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}