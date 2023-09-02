package Seminar2.example2;

class Cat implements Sound {
    private String name;
    private int age;
    public Cat() {
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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
    @Override
    public void greet() {
        System.out.println(String.format("Мяу! Меня зовут %s, мне %d года", getName(), getAge()));
    }
}

