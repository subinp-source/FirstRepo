package com.MyTrial.javaexamples;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args){
        String[] sample = {"BMW","bMW","bmW","Bmw","BMw","bMw","bmw","BmW"};
        Scanner s = new Scanner(System.in);
        String sett;
        String[] input = new String[9];
        for (int i = 0; i<9;i++){
            System.out.println("enter the word");
            input[i]=s.nextLine();
        }
        for (int i=0;i<9;i++){
            for (int j=0;j<8;j++){
                if(input[i].equals(sample[j])){
                    sett = input[i];
                    input[i] = input[0];
                    input[0] = sett;


                }
            }
        }
        System.out.println("corrected order");
        for (int i = 0;i<9;i++){
            System.out.println(input[i]);
        }

    }
}
