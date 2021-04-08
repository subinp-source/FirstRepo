package com.MyTrial.javaexamples;

public class RunnableExample {
    public static void main(String... args){
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("printed inside runnable");
            }
        });myThread.run();
        // now same using the lambda concept
        // we can also use start() function instead of run()
        Thread myThread1 = new Thread(() -> System.out.println("printed inside lambda runnable"));
        myThread1.start();
    }
}
