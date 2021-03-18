package com.MyTrial.javaexamples;
import java.util.Scanner;

public class TaskRepeating {
    public static void main(String[] args){
        int k=0;
        char[] copy = new char['%'];
        int count;
        Scanner output = new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence = output.nextLine();
        sentence = sentence.toLowerCase();
        char[] line = sentence.toCharArray();
        for (int i=0;i<line.length;i++){
            count=1;
            for (int m=0;m<=i;m++){
                if (line[i]==copy[m]){
                    i++;
                }
            }
            for (int j = i + 1; j < line.length; j++) {
                    if (line[i] == line[j] && line[i] != ' ') {
                        count++;
                    }
                }
                if (count > 1) {
                    copy[k] = line[i];
                    k++;
                    System.out.println("the letter is " + line[i] + " " + count);
                }



        }
    }
}
