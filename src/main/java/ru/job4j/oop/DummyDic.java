package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String string = "Вывел!";
        return string;
    }

    public static void main(String[] args) {
        DummyDic engin = new DummyDic();
        String eng = engin.engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }
}
