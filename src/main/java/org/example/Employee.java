package org.example;

public class Employee {
    private String emp_name;
    private int salary;

    public Employee(String emp_name, int salary) {
        this.emp_name = emp_name;
        this.salary = salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public int getSalary() {
        return salary;
    }

    public void logDetails(){
        System.out.println("name :  " +emp_name+ " salary: RS."+salary +".");
    }
}
