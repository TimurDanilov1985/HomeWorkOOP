package Seminar6.Single;

// Класс несет единую ответственность за хранение своей конкретной информации

public class RobotWorker {
    private String manufacturer;
    private String model;

    public RobotWorker(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
