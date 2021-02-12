package com.MyTrial.javaexamples;
import java.util.Scanner;
public class LeapTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double n;
        System.out.println("enter the year");
        int m=0;
        n = s.nextDouble();
       if (n%100==0){
           if (n%400==0 && n%4==0){
               System.out.println("century leap year");
           }
           else System.out.println("not a century leap year");
       }
       else if (n%4==0){
           System.out.println("it is a leap year");
       }
       else System.out.println("not leap year");
    }
}
