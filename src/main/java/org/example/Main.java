package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("arun", 25000));
        employees.add(new Employee("kumar", 2500));
        employees.add(new Employee("aravind", 5000));
        employees.add(new Employee("beula", 100000));
        employees.add(new Employee("mehavel", 4000));

        for (Employee emp : employees) {
            if (emp.getSalary() < 10000) {
                emp.logDetails();
            }
        }
        trafficState trfst = new trafficState();
        for (int i = 0; i < 6; i++) {
            System.out.println("Current state - " + trfst.getCurrentState() + ", Duration - " + trfst.getcurrentStateDurations() + " seconds");
            trfst.changeState();
        }
    }
}