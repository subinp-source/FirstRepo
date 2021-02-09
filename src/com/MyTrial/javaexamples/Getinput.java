package com.MyTrial.javaexamples;
import java.util.Scanner;
public class Getinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the line of text");
        String text = input.nextLine();
        System.out.println("entered text is"+" "+text);
    }
}
