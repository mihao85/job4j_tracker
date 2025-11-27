package ru.job4j.oop;

public class Error {
    public boolean active;
    public int status;
    public String messadge;

    public Error() {
    }

    public Error(boolean active, int status, String messadge) {
        this.active = active;
        this.status = status;
        this.messadge = messadge;
    }

    public void print() {
        System.out.println(active + " " + status + " " + messadge);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 1, "Ошибка 2");
        error.print();
        error1.print();
    }

}
