package Seminar2.example3;

class Rectangle implements Calculate {
    private int width;
    private int weight;

    public Rectangle() {
        this.width = WIDTH;
        this.weight = WEIGHT;
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

    @Override
    public int calculateArea() {
        return getWidth() * getWeight();
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (getWidth() + getWeight());
    }

}
