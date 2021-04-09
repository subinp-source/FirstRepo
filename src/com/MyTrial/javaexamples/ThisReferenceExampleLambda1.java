package com.MyTrial.javaexamples;

public class ThisReferenceExampleLambda1 {
    public void execute(){
        doProcess(10,i -> {
            System.out.println(i);
            System.out.println(this);
        });
    }
    public void doProcess(int i, ThisReferenceExampleLambda1.Process p){
        p.process(i);
    }

    public static void  main(String... args){
        ThisReferenceExampleLambda1 thisReferenceExampleLambda1= new ThisReferenceExampleLambda1();
       /* thisReferenceExampleLambda1.doProcess(10, i -> {
            System.out.println(i);
            System.out.println(this);this will not work (because we are used 'this' inside lambda.but will work in anonymous class
        });*/
       thisReferenceExampleLambda1.execute();
    }
    interface Process{
        void process(int i);
    }
    public String toString(){
        return "this statement problem arises";
    }

}
