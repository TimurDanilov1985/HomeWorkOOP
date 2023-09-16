package Seminar6.openClosed;

// Расширение функционала родительского класса дочерним

public class Light extends Truck implements LoadingCargo{
    private int power;

    public Light(String model, String capacity, double price, int power) {
        super(model, capacity, price);
        this.power = power;
    }

    @Override
    public void load() {
        System.out.println("Загрузка");
    }
}
