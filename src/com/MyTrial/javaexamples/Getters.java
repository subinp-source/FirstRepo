package com.MyTrial.javaexamples;
class person{
    String name;
    int age;
    int getage() {
        return age;
    }
    String getstring() {
        return name;
    }
}

public class Getters {
    public static void main(String[] args){
        person human = new person();
        human.name="sachin";
        human.age=45;
        int age = human.getage();
        String name = human.getstring();
        System.out.println(age);
        System.out.println(name);
    }
}
