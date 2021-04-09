package com.MyTrial.javaexamples;

import java.util.function.BiConsumer;

public class ExceptionalHandlingUsingLambda {
    public static void main(String... args){
        int [] numbers={10,20,30,40,50,60,70,80,90,100,99,33,22,11,45,54,101,0};
        int key=0;
        perform(numbers,key,(i,k) ->{
            try{
        System.out.println(i/key);}
            catch (ArithmeticException e){
                System.out.println("an arithmetic error has occurred");
            }
        });
    }

    private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i:numbers
             ) {
            biConsumer.accept(i,key);

        }
    }
}
