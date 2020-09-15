package org;

import com.Worker;

import java.util.ArrayList;

public class CompanyTest {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>(6);
        Worker worker1 = new Worker("Ivan", 25, 19, 1000);
        Worker worker2 = new Worker("Kostadin", 75, 27, 5000);
        workers.add(worker1);
        workers.add(worker2);
        Worker worker3 = new Worker("Dragan", 56, 29, 3400);
        Company company = new Company(workers, 7, worker3);
        company.replaceWorker(worker2);
        System.out.println(company);
    }
}
