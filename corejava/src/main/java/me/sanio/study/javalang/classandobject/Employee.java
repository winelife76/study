package me.sanio.study.javalang.classandobject;

import me.sanio.study.javalang.inheritance.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public  Employee(){
        this("",100.0,2019,6,20);
    }

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public Employee getBuddy(){
        return null;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }
}
