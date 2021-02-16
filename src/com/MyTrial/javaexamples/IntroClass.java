package com.MyTrial.javaexamples;
class person1{
    String name;
    int age;
    void speak() {
        System.out.println("name is "+name+" and age is just "+age+" years old");
    }
}

public class IntroClass {
    public static void main(String[] args){
        person1 raju = new person1();
        raju.name="raju";
        raju.age=25;
        raju.speak();

    }
}
