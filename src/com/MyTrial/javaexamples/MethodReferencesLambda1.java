package com.MyTrial.javaexamples;

public class MethodReferencesLambda1 {
    public static void main(String... args){
        Thread T =new Thread(() -> ProcessMessage());
        T.start();
    }

    private static void ProcessMessage() {
        System.out.println("Hello World");
    }
}
