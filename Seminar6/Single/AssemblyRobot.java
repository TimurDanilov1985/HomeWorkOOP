package Seminar6.Single;

public class AssemblyRobot {
    // Разделение ответсвенности на сборку и сварку при производстве по классам (у одного класса одна отвтсвенность)
    private RobotWorker robotWorker;

    public AssemblyRobot(RobotWorker robotWorker) {
        this.robotWorker = robotWorker;
    }

    public void assemblingParts() {
        System.out.println("Сборка деталей");
    }

}
