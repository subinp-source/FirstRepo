package com.MyTrial.javaexamples;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main (String... args){
        Greeter greeter = new Greeter();
       Greeting helloWorldGreeting=new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
        Greeting foo = new Greeting() {
            @Override
            public void perform() {
                System.out.println("hai hello world");
            }
        };
        foo.perform();
        Greeting lambdagreeting = () -> System.out.println("hello world through lambda");
        helloWorldGreeting.perform();
        lambdagreeting.perform();
        greeter.greet(lambdagreeting);
        greeter.greet(foo);
    }


}

