package com.MyTrial.javaexamples;
import java.util.Scanner;

public class TaskRepeating {
    public static void main(String[] args){

        Scanner output = new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence = output.nextLine();
        sentence = sentence.toLowerCase();
        char[] line = sentence.toCharArray();
        generaterepeating(line);

    }
    public static void generaterepeating(char reciever[]){
        int k=0;
        char[] copy = new char['%'];
        int count;
        for (int i=0;i<reciever.length;i++){
            count=1;
            for (int m=0;m<=i;m++){
                if (reciever[i]==copy[m]){
                    i++;
                }
            }
            for (int j = i + 1; j < reciever.length; j++) {
                if (reciever[i] == reciever[j] && reciever[i] != ' ') {
                    count++;
                }
            }
            if (count > 1) {
                copy[k] = reciever[i];
                k++;
                System.out.println("the letter is " + reciever[i] + " " + count);
            }



        }

    }
}
