package com.MyTrial.javaexamples;

public class Lambdaclosure2 {
    public static void main(String... args) {
        int a = 1000;
        int b = 115;
        doProcess(a, i -> System.out.println(i + b));

    }
    interface Process{
        void process(int i);
    }
    public static void doProcess(int i, LambdaClosure.Process p){
        p.process(i);
    }
}
