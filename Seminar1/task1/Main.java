package Seminar1.task1;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat();
        murka.setName("Рыжик");
        murka.setAge(3);
        Ovner human = new Ovner();
        human.setName("Муся");
        murka.setOvnerName(human.getName());
        murka.greet();
    }
}