package Seminar6.Segregation;

// Интерфейсы разделены и содержат методы реализующие функцию каждого класса промышленных роботов по отдельности соответственно

public class Main {
    public static void main(String[] args) {
        RobotCarrier robotCarrier = new RobotCarrier();
        RobotAssembler robotAssembler = new RobotAssembler();
        RobotWelder robotWelder = new RobotWelder();
        robotCarrier.drive();
        robotCarrier.takingDetail();
        robotCarrier.drive();
        robotCarrier.putDetail();
        robotAssembler.assembling();
        robotWelder.welding();
    }
}