package com.MyTrial.javaexamples;
import java.util.Scanner;
class AutoDuplicate{
    public void autoduplicate(char text[]){
        int count;
        for(int i = 0; i <text.length; i++) {
            count = 1;
            for(int j = i+1; j <text.length; j++) {
                if(text[i] == text[j] && text[i] != ' ') {
                    count++;
                    text[j] = '0';
                }
            }

            if(count > 1 && text[i] != '0')
                System.out.println(text[i] +" "+count);
        }
    }
}
public class TaskDuplicate1 {

    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = output.nextLine();
        input = input.toLowerCase();
        char string[] = input.toCharArray();
         AutoDuplicate D= new AutoDuplicate();
         D.autoduplicate(string);
    }

    }

