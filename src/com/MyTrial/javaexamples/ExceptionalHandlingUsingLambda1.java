package com.MyTrial.javaexamples;

import java.util.function.BiConsumer;

public class ExceptionalHandlingUsingLambda1 {
        public static void main(String... args){
        int [] numbers={10,20,30,40,50,60,70,80,90,100,99,33,22,11,45,54,101,0};
        int key=5;
        perform(numbers,key,WrapperLambda((i,k) -> System.out.println(i/k)));
    }

        private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int i:numbers
        ) {
            biConsumer.accept(i,key);

        }
    }
    private static BiConsumer<Integer, Integer> WrapperLambda(BiConsumer<Integer, Integer> biConsumer){
            return (i,k) -> {
                try{
                biConsumer.accept(i,k);
            }
                catch (ArithmeticException e){
                    System.out.println("an arithmetic error has occurred");}
                };
    }

}
