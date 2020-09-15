package com;

public class Person {
    private String name;
    private int SSD;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "Ivan" : name;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD < 0 ? 0: SSD;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age <= 0 ? 1 : age;
    }

    public Person() {
        this("Ivan", 0, 1);
    }

    public Person(String name, int SSD, int age) {
        setName(name);
        setAge(age);
        setSSD(SSD);
    }

    public Person(Person other)
    {
        this(other.name,other.SSD,other.age);
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", name, SSD, age);
    }
}
