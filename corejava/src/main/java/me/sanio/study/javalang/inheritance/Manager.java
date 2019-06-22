package me.sanio.study.javalang.inheritance;


import me.sanio.study.javalang.classandobject.Employee;

public class Manager extends Employee {
    private double bonus;

    /**
     * @param name   the employee's name
     * @param salary the salary
     * @param year   the hire year
     * @param month  the hire month
     * @param day    the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        if (bonus == 0)
            bonus = baseSalary * 0.1;
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public Manager getBuddy() {
        return null;
    }

    public String getDescription() {
        return String.format("an Manager with a salary of $%.2f", getSalary());
    }
}
