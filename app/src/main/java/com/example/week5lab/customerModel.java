package com.example.week5lab;

public class customerModel {
    private int ID;
    private String name;
    private int age;
    private boolean isActive;

    public customerModel() {
    }

    public customerModel(int i, String toString, int a, boolean ac) {
        ID = i;
        name = toString;
        age=a;
        isActive= ac;


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "customerModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }

    public String getName() {
        return name;
    }
}
