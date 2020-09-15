package org;

import com.Worker;

import java.util.ArrayList;
import java.util.Random;

public class Company {
    ArrayList<Worker> workers;
    int count;
    Worker boss;

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        if(workers == null)
        {
            workers.add(new Worker());
        }
        else {
            this.workers = workers;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count ==0 ? 1 : count;
    }

    public Worker getBoss() {
        return boss;
    }

    public void setBoss(Worker boss) {
        if (boss == null)
        {
            this.boss = new Worker();
        }
        else
        {
            this.boss = boss;
        }
    }

    public Company(ArrayList<Worker> workers, int count, Worker boss) {
       setWorkers(workers);
        setCount(count);
        setBoss(boss);

    }

    public Company() {
        this(null, 2, null);
    }

    public Company(Company other){
        this(other.getWorkers(),other.getCount(),other.getBoss());
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s", getWorkers(), getCount(), getBoss());
    }

    public void replaceWorker(Worker other){
        Random rd = new Random();
        if(workers.contains(other)){
            if(other.getSalary() >= 2000){
                int newSalary = 500 + rd.nextInt(1500);
                Worker newWorker = new Worker(Names.DEFAULT.toString(), 98, 18, newSalary );
                workers.set(workers.indexOf(other), newWorker);
            }
        }
    }
}
