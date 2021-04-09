package com.MyTrial.javaexamples;

public class LambdaClosure {
    public static void main(String... args){
        int a=1000;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
            }
        });
    }


    interface Process{
        void process(int i);
    }
   public static void doProcess(int i,Process p){
        p.process(i);
    }
}
