package Seminar1.task3;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book book = new Book("Чистый код", "Роберт Мартин", true);
        lib.addBook(book);

        Book book1 = new Book("Архитектура компьютера", "Эндрю Таненбаум", true);
        lib.addBook(book1);

        Book book2 = new Book("Совершенный код", "Стив Макконелл", true);
        lib.addBook(book2);

        lib.displayAvailableBooks();
        lib.searchByAuthor("Роберт Мартин");
    }
}
