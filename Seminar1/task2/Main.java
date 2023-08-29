package Seminar1.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setWeight(20);
        System.out.println(String.format("Площадь прямоугольника равна: %d мм", r.calculateArea()));
        System.out.println(String.format("Периметр прямоугольника равнен: %d мм", r.calculatePerimeter()));
    }
}
