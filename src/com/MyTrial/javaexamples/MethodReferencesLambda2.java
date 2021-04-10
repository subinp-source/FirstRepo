package com.MyTrial.javaexamples;

public class MethodReferencesLambda2 {
    public static void main(String... args){
        Thread T =new Thread(MethodReferencesLambda2 :: ProcessMessage);
        T.start();
    }

    private static void ProcessMessage() {
        System.out.println("Hello World");
    }
}
