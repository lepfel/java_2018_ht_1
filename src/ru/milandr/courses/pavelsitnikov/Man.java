package ru.milandr.courses.pavelsitnikov;

public class Man {
    private int age;
    private double height;
    private double weight;
    private boolean isMarried;
    private String language;

    public Man(int age) {
        this.age = age;
        this.height=200D;
        this.weight=60D;
        this.isMarried = false;
        this.language = "ru";
    }

    public Man(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = false;
        this.language = "ru";
    }

    public Man(int age, double height, double weight, String language) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.language = language;
        this.isMarried = false;
    }

    public Man(int age, double height, double weight, boolean isMarried, String language) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
