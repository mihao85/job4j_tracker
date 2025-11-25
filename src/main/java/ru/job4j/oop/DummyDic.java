package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic engin = new DummyDic();
        String string = engin.engToRus("Вызвал.");
        System.out.println(string);
    }
}
