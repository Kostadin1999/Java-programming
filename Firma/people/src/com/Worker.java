package com;

public class Worker extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary <= 0 ? 500 : salary;
    }

    public Worker(String name, int SSD, int age, int salary) {
        super(name, SSD, age);
        this.salary = salary;
    }

    public Worker() {
        this("Ïvan", 0, 1, 500);
    }

    public Worker(Worker other) {
        this(other.getName(), other.getSSD(), other.getAge(), other.salary);
    }

    @Override
    public String toString() {
        return String.format( super.toString() + "salary: %s",salary );
    }
}
