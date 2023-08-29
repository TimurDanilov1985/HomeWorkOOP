package Seminar1.task3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book b) {
        catalog.add(b);
    }

    public void removeBook(Book b) {
        catalog.remove(b);
    }

    public void displayAvailableBooks() {
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i).getTitle() + " " +
                    catalog.get(i).getAuthor() + " " + catalog.get(i).getAvailable());
        }
    }

    public void searchByAuthor(String autor) {
        StringBuilder sb = new StringBuilder();
        String s = "Найдены книги по автору: ";
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).getAuthor().equals(autor)) {
                sb.append(s);
                sb.append(catalog.get(i).getTitle());
                sb.append(" ");
                sb.append(catalog.get(i).getAvailable());
                System.out.println(sb.toString());
            }
        }
    }
}
