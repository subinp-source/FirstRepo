package com.MyTrial.javaexamples;

import java.util.Arrays;
import java.util.List;

public class LambdaStream0 {
    public static void main(String... args){
        List<Human> humans = Arrays.asList(
                new Human("anoop", "anandan", 22),
                new Human("subin", "p", 23),
                new Human("sujoy", "kg", 22),
                new Human("vishnu", "anil", 24),
                new Human("mohan", "lal", 60),
                new Human("adithya", "biji", 24),
                new Human("charles", "dickens", 58),
                new Human("moideen", "koya", 81));
        humans.stream().filter(p -> p.getLastName().startsWith("p")).forEach(p -> System.out.println(p.getFirstName()));
        long count = humans.stream().filter(p -> p.getFirstName().endsWith("a")).count();
        System.out.println(count);
        long count1 = humans.parallelStream().filter(p -> p.getFirstName().startsWith("s")).count();
        System.out.println(count1);

    }
}
