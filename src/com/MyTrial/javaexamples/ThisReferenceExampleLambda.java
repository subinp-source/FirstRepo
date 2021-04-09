package com.MyTrial.javaexamples;

public class ThisReferenceExampleLambda {
    public void doProcess(int i,Process p){
        p.process(i);
    }
    public static void main(String... args){
        ThisReferenceExampleLambda thisReferenceExampleLambda=new ThisReferenceExampleLambda();
        thisReferenceExampleLambda.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.println(this);
            }
        });
    }


    interface Process{
        void process(int i);
    }
}
