package com.MyTrial.javaexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdajava8Exercise1 {
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
            Collections.sort(humans,(h1, h2) -> h1.getLastName().compareTo(h2.getLastName()));
            //create a method to print all the elements
            PrintContionally(humans,p -> true,h1 -> System.out.println(h1));

            //create a method to print elements containing last name
            PrintContionally(humans,(h1) -> h1.getLastName().startsWith("d"),h1 -> System.out.println(h1));
        }

        private static void PrintContionally(List<Human> humans, Predicate<Human> predicate, Consumer<Human> consumer) {
        for (Human h:humans
        ) {
            if (predicate.test(h)){
                consumer.accept(h);
            }

        }
    }


}
