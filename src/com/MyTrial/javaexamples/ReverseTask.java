package com.MyTrial.javaexamples;
import java.util.Scanner;
public class ReverseTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,a,b=0;
        System.out.println("enter the number");
        n = s.nextInt();
        for (;n>0;){
            a=n%10;
            b=b*10+a;
            n=n/10;

        }
        System.out.println(b);

    }
}
