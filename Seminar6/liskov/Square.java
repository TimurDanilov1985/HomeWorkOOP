package Seminar6.liskov;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Переопределенный метод интерфейса, где реализуется логика соответсвующая данному классу
    @Override
    public double area() {
        return side * side;
    }
}
