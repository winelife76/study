package me.sanio.study.javalang.inheritance;

public abstract class  Person {
    String name;

    public Person(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public abstract String getDescription();

}
