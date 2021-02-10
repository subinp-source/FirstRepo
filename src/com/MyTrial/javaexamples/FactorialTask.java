package com.MyTrial.javaexamples;
import java.util.Scanner;
public class FactorialTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number to find factorial");
        double fact=1,n,i;
        n = s.nextDouble();
        for (i=1;i<=n;i++){
            fact =fact*i;
        }
        System.out.println(fact);

    }
}
