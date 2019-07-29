package me.sanio.study.javalang.classandobject;

import me.sanio.study.javalang.inheritance.Person;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee() {
        this("", 100.0, 2019, 6, 20);
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

    public Employee getBuddy() {
        return null;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

   /* @Override
    public boolean equals(Object obj) {
        // a quick test to see if the objects are identical
        if (this == obj) return true;

        // must return false if the explicit parameter is null
        if (obj == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != obj.getClass()) return false;

        // now we know otherObject is a non-null Employee
        Employee other = (Employee) obj;

        // test whether the fields have identical values
        return Objects.equals(super.getName(), other.getName()) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }*/
}
