package com.MyTrial.javaexamples;
import java.util.Scanner;
public class FibonacciTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a,b,c,n;
        System.out.println("enter the no.of terms");
        n = s.nextInt();
        a=0;b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=1;i<=n;i++){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
