package com.MyTrial.javaexamples;
class robot{
     private String name;
     private int age;
    public String setname(String name){
        this.name=name;
        return name;
    }
    public int setage(int age){
        this.age=age;
        return age;

    }

}

public class Setter2method {
    public static void main(String[] args) {
        robot robo = new robot();
        String word= robo.setname("rahul");
        int age= robo.setage(40);
        System.out.println(word);
        System.out.println(age);

    }
}