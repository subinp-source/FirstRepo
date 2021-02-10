package com.MyTrial.javaexamples;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sett;
        String[] word = new String[3];
        for(int i = 0;i<3;i++){
            System.out.println("enter the word ");
            word[i] = input.nextLine();
        }
        for (int k = 0; k<3;k++){
           if ((word[k].equals("BMW")) || (word[k].equals("bMW")) || (word[k].equals("bmW")) || (word[k].equals("bmw")) || (word[k].equals("BMw")) || (word[k].equals("bMw"))){
                sett=word[k];
                word[k]=word[0];
                word[0]=sett;
            }
        }
        System.out.println("corrected one");
        for (int i=0;i<3;i++){
            System.out.println(word[i]);
        }

    }
}
