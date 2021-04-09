package com.MyTrial.javaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaJava8Exercise {
    public static void main(String... args)

    {
        List<Human> humans= Arrays.asList(
                new Human("anoop","anandan",22),
                new Human("subin","p",23),
                new Human("sujoy","kg",22),
                new Human("vishnu","anil",24),
                new Human("mohan","lal",60),
                new Human("adithya","biji",24),
                new Human("charles","dickens",58),
                new Human("moideen","koya",81));
        //sort the list
        Collections.sort(humans,(h1,h2) -> h1.getLastName().compareTo(h2.getLastName()));
        //create a method to print all the elements
        PrintContionally(humans,p -> true);

        //create a method to print elements containing last name
        PrintContionally(humans,(h1) -> h1.getLastName().startsWith("d"));
    }

    private static void PrintContionally(List<Human> humans, LambdaExercise1.Condition condition) {
        for (Human h:humans
        ) {
            if (condition.test(h)){
                System.out.println(h);
            }

        }
    }

    interface Condition{
        public Boolean test(Human h);
    }

}

