package hometask1;

public class Elephant {
    private String name;
    private int mass;

    public Elephant(String name, int mass) {
        this.mass = mass;
        this.name = name;
        System.out.println("Elephant " + this.name + " with mass " + this.mass + "has successfully created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        this.mass++;
        System.out.println("Elephant ate");
    }

    public void printElephant() {
        System.out.println("Elephant " + this.name + " with mass " + this.mass);
    }
}