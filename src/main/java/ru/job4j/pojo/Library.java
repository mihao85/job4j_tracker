package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Война и мир", 1472);
        Book book1 = new Book("Голод", 158);
        Book book2 = new Book("Деревня", 70);
        Book book3 = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - стр. " + book.getNamberOfpages());
        }
        System.out.println();
        System.out.println("Замена книг:");
        Book replacement = books[0];
        books[0] = books[3];
        books[3] = replacement;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - стр. " + book.getNamberOfpages());
        }
        System.out.println();
        System.out.println("Вывод конкретной книги:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                Book book = books[i];
                System.out.println(book.getName() + " - стр. " + book.getNamberOfpages());
                break;
            } else {
                System.out.println("Такой книги нет!");
            }
        }
    }
}
