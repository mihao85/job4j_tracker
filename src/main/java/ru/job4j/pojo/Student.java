package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;
    private int group;
    private LocalDate dateOfreceipt;

    public String getFio() {
        return fio;
    }

    public int getGroup() {
        return group;
    }

    public LocalDate getDateOfreceipt() {
        return dateOfreceipt;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setDateOfreceipt(int year, int month, int dayOfMonth) {
        this.dateOfreceipt = LocalDate.of(year, month, dayOfMonth);
    }
}
