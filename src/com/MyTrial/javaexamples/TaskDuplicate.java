package com.MyTrial.javaexamples;
import java.util.Scanner;

public class TaskDuplicate {
    public static void main(String[] args) {
        int count =0;
        char temp;
        Scanner cout = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = cout.nextLine();
        input = input.toLowerCase();
        char string[] = input.toCharArray();
        for (int i = 0; i < string.length; i++) {
            temp = string[i];
            for (int j = 0; j < string.length; j++) {
                if (string[j] == temp) {
                    count++;
                    string[j] ='0';
                }
            }
                if (count>1 && string[i]!='0') {
                    System.out.println(temp + " " + count);
                    count=0;
                }
        }

    }

}






