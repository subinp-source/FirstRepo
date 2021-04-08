package com.MyTrial.javaexamples;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class LambdaExercise1 {
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
        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //create a method to print all the elements
        Printall(humans);

        //create a method to print elements containing last name
        PrintContionally(humans, new Condition() {
            @Override
            public Boolean test(Human h) {
                return h.getLastName().startsWith("d");
            }
        });
    }

    private static void PrintContionally(List<Human> humans, Condition condition) {
        for (Human h:humans
             ) {
            if (condition.test(h)){
                System.out.println(h);
            }

        }
    }

    private static void Printall(List<Human> humans) {
        for (Human h:humans
             ) {
            System.out.println(h);

        }
    }
    interface Condition{
        public Boolean test(Human h);
    }

}
