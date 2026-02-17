package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Горшенина Анна Владимировна");
        student.setGroup(3);
        student.setDateOfreceipt(2021, 9, 2);
        System.out.println(student.getFio() + " учится в " + student.getGroup() + " группе " + " с " + student.getDateOfreceipt());
    }
}
