package Seminar6.Single;

public class WeldRobot {
    // Разделение ответсвенности на сборку и сварку при производстве по классам (у одного класса одна отвтсвенность)
    private RobotWorker robotWorker;

    public WeldRobot(RobotWorker robotWorker) {
        this.robotWorker = robotWorker;
    }

    public void horizontalWelding() {
        System.out.println("Сварка в горизонтальном положении");
    }
    public void verticalWelding() {
        System.out.println("Сварка в вертикальном положении");
    }
}
