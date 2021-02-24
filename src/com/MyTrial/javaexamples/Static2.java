package com.MyTrial.javaexamples;
import java.util.Scanner;
class cax2{
    private static int age;
    private static String name;
    private int ages;
    private String names;
    private final static int num=23;
    public static int showage(int a){
        age=a;
        return age;
    }
}

public class Static2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a =input.nextInt();

        System.out.println(cax2.showage(a));
       /* cax1.ages=21;
        cax2.age=46;
        cax1.names="ravi";
        cax2.name="raju";
        System.out.println(cax2.name);
        System.out.println(cax2.age);
        System.out.println(cax2.num);*/
    }
}
