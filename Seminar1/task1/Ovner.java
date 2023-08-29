package Seminar1.task1;

public class Ovner {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String nameOvner) {
        if(nameOvner.isEmpty()){
            System.out.println("Введено пустое имя");
        }
        else {
            this.name = nameOvner;
        }
    }
}
