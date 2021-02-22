package com.MyTrial.javaexamples;
class humanbeing{
    public humanbeing() {
        this("raju");
        System.out.println("constructor is running");

    }
    public humanbeing(String name){
        this(30,"70");
        System.out.println(name);
    }
    public humanbeing(int a ,String b){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Constructor {
    public static void main(String[] args){
        humanbeing human = new humanbeing();
        new humanbeing("ultimate human");
        new humanbeing(27,"ravi");
    }
}
