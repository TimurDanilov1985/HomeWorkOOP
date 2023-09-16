package Seminar6.Single;

public class Main {
    public static void main(String[] args) {
        RobotWorker robotWorker = new RobotWorker("RusIndustrialRobots", "Z500");
        WeldRobot weldRobot = new WeldRobot(robotWorker);
        AssemblyRobot assemblyRobot = new AssemblyRobot(robotWorker);
        assemblyRobot.assemblingParts();
        weldRobot.horizontalWelding();
        weldRobot.verticalWelding();
    }
}