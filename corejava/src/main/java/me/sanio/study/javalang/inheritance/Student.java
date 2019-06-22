package me.sanio.study.javalang.inheritance;

public class Student extends Person {
    public String major;

    /**
     *
     * @param n
     * @param major
     */
    public Student(String n,String major){
        super(n);
        this.major = major;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
