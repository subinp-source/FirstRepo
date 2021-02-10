package com.MyTrial.javaexamples;
import java.util.Scanner;
public class LeapTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("enter the year");
        n = s.nextInt();
        if (n%400==0 && n%100==0){
            System.out.println("it is a century leap year");}
        else if (n%4==0){
            System.out.println("it is a leap year");

        }
        else System.out.println("not a leap year");

    }
}
