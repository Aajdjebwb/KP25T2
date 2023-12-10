package com.example.myapplication.myapplicationkp25.model;
import java.io.Serializable;
public class Book implements Serializable {
    private String name;
    private String autor;
    private int year;
    public Book(String name, String type, int power) {
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}