package me.sanio.study.javalang.inheritance;

import me.sanio.study.javalang.classandobject.Employee;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        people[2] = new Manager("alex", 95000, 2018, 4, 5);
        people[3] = new Manager("alex", 95000, 2018, 4, 5);
        Person pp = (Person) people[3];

        ((Manager) pp).setBonus(5000);
        people[4] = pp;


        // print out names and descriptions of all Person objects
        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription() + ",HC:" + p.hashCode() + " | " + p.toString());

        System.out.println(people[2].equals(people[3]));
        System.out.println(pp.equals(people[3]));
        System.out.println(people[3].equals(pp));
    }
}
