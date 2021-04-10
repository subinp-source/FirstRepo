package com.MyTrial.javaexamples;

public class MethodReferencesLambda {
    public static void main(String... args){
        Thread T =new Thread(new Runnable() {
            @Override
            public void run() {
                ProcessMessage();
            }
        });
        T.start();
    }

    private static void ProcessMessage() {
        System.out.println("Hello World");
    }
}
