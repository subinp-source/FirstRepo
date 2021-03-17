package com.MyTrial.javaexamples;
import java.util.Scanner;

public class TaskDuplicate {
    public static void main(String[] args) {
        int count;
        char temp;
        Scanner cout = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = cout.nextLine();
        input = input.toLowerCase();
        char string[] = input.toCharArray();
        for (int i = 0; i < string.length; i++) {
            count=1;
            temp = string[i];
            for (int j =i+1; j < string.length; j++) {
                if (temp==string[j] && temp!=' ') {
                    count++;
                    string[j] ='0';
                }
            }
                if (count>1 && temp!='0') {
                    System.out.println(temp + " " + count);
                }
        }

    }

}






