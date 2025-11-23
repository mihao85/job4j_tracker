package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox namder = new Jukebox();
        namder.music(1);
        namder.music(2);
        namder.music(3);
        namder.music(4);
    }

    public void music(int position) {

        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");

        }
    }
}

