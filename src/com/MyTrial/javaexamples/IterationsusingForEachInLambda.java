package com.MyTrial.javaexamples;

import java.util.Arrays;
import java.util.List;

public class IterationsusingForEachInLambda {
    public static void main(String... args) {
        List<Human> humans = Arrays.asList(
                new Human("anoop", "anandan", 22),
                new Human("subin", "p", 23),
                new Human("sujoy", "kg", 22),
                new Human("vishnu", "anil", 24),
                new Human("mohan", "lal", 60),
                new Human("adithya", "biji", 24),
                new Human("charles", "dickens", 58),
                new Human("moideen", "koya", 81));
        //using ordinary for loop
        for (int i=0;i<humans.size();i++){
            System.out.println(humans.get(i));
        }
        System.out.println();
        //using for in loop
        for (Human h:humans
             ) {
            System.out.println(h);

        }
        System.out.println();
        // using foreach in using lambda
        humans.forEach(p -> System.out.println(p.getAge()));// we can print ages only
        System.out.println();
        humans.forEach(p -> System.out.println(p.getFirstName()));// we can print firstname only
        System.out.println();
        humans.forEach(p -> System.out.println(p.getLastName()));// we can print last name only
        System.out.println();
        humans.forEach(p -> System.out.println(p));// printing everything
        System.out.println();
        //same approach but using method reference
        humans.forEach(System.out::println);//this code is more crisp and esay to execute, but will execute in random manner


    }
}
