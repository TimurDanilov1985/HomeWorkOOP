package Seminar6.openClosed;

// Расширение функционала родительского класса дочерним

public class Heavy extends Truck implements LoadingCargo{
    private String additionalTank;

    public Heavy(String model, String capacity, double price, String additionalTank) {
        super(model, capacity, price);
        this.additionalTank = additionalTank;
    }

    @Override
    public void load() {
        System.out.println("Загрузка и заправка дополнительного бака");
    }
}
