package Seminar1.task1;

public class Cat {
    private String name;
    private int age;
    private String ovnerName;

    public String getOvnerName() {
        return ovnerName;
    }

    public void setOvnerName(String ovnerName) {
        this.ovnerName = ovnerName;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String nameCat) {
        if (nameCat.isEmpty()) {
            System.out.println("Введено пустое имя");
        }
        else {
            this.name = nameCat;
        }
    }
    public void setAge(int ageCat) {
        if (ageCat > 0) {
            this.age = ageCat;
        }
        else {
            System.out.println("Что то не так с возрастом");
        }
    }
    public void greet() {
        System.out.println(String.format("Мяу! Меня зовут %s, мне %d года. Мой владелец %s", getName(), getAge(),getOvnerName()));
    }
}
