package com.MyTrial.javaexamples;

public class String_array {
    public static void main(String[] args){
        String[] text = new String[3];
        text[0] = "mango";
        text[1] = "banana";
        text[2] = "orange";
        for (String texts : text){
            System.out.println(texts);
        }
    }
}
