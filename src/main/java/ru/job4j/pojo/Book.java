package ru.job4j.pojo;

public class Book {
    private String name;
    private int namberOfpages;

    public Book(String name, int namberOfpages) {
        this.name = name;
        this.namberOfpages = namberOfpages;
    }

    public String getName() {
        return name;
    }

    public int getNamberOfpages() {
        return namberOfpages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNamberOfpages(int namberOfpages) {
        this.namberOfpages = namberOfpages;
    }
}
