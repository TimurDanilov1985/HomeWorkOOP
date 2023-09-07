package Seminar3.example3;

public class Truck {
    private String name;
    private double capacity;
    private int motion;
    public Truck() {

    }
    public Truck(String name, double capacity, int motion) {
        this.name = name;
        this.capacity = capacity;
        this.motion = motion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMotion() {
        return motion;
    }

    public void setMotion(int motion) {
        this.motion = motion;
    }
}
