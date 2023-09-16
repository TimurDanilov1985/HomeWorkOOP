package Seminar6.liskov;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(5);
        System.out.println(rectangle.area());
        System.out.println(square.area());
    }
}
