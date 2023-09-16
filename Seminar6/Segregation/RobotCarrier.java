package Seminar6.Segregation;

public class RobotCarrier implements Transportation{
    @Override
    public void drive() {
        System.out.println("Перемещение");
    }

    @Override
    public void takingDetail() {
        System.out.println("Взять деталь в буфере склада");
    }

    @Override
    public void putDetail() {
        System.out.println("Установить деталь на сборочный стол");
    }
}
