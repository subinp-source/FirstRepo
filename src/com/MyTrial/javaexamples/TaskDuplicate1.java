package com.MyTrial.javaexamples;
import java.util.Scanner;
class AutoDuplicate{
    public void autoduplicate(char abc[]){
        int count;
        for(int i = 0; i <abc.length; i++) {
            count = 1;
            for(int j = i+1; j <abc.length; j++) {
                if(abc[i] == abc[j] && abc[i] != ' ') {
                    count++;
                    abc[j] = '0';
                }
            }

            if(count > 1 && abc[i] != '0')
                System.out.println(abc[i] +" "+count);
        }
    }
}
public class TaskDuplicate1 {
    public static void main(String[] args) {
        int count;
        Scanner output = new Scanner(System.in);
        System.out.println("enter the sentence");
        String input = output.nextLine();
        input = input.toLowerCase();
        char string[] = input.toCharArray();
         AutoDuplicate D= new AutoDuplicate();
         D.autoduplicate(string);
    }

    }

