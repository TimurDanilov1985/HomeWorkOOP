package Seminar2.example3;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(String.format("Полщадь: %d мм, Периметр: %d мм", r.calculateArea(), r.calculatePerimeter()));
    }
}