package com.MyTrial.javaexamples;
import java.util.Scanner;
public class CheckalphaTask {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a character");
        char h = s.next().charAt(0);
        switch(h){
            case 'a': case 'A':
                System.out.println("vowel entered is A");
                break;
            case 'e': case 'E':
                System.out.println("vowel entered is E ");
                break;
            case 'i': case 'I':
                System.out.println("vowel entered is I ");
                break;
            case 'o': case'O':
                System.out.println("vowel entered is O");
                break;
            case 'u': case 'U':
                System.out.println("vowel entered is U");
                break;
            default:System.out.println("entered character is consonant");

        }
    }
}
