package Seminar1.task2;

public class Rectangle {
    private int width;
    private int weight;

    public Rectangle() {
        this.width = 1;
        this.weight = 2;
    }

    public Rectangle(int width, int weight) {
        this.width = width;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Введите положительное значение");
        }
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Введите положительное значение");
        }
    }

    public int calculateArea() {
        return getWidth() * getWeight();
    }

    public int calculatePerimeter() {
        return 2 * (getWidth() + getWeight());
    }
}
