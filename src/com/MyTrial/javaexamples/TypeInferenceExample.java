package com.MyTrial.javaexamples;

public class TypeInferenceExample {
    public static void main(String... args){
        printlength(s -> s.length());
    }
    interface StringLengthlambda{
        int getlength(String b);
    }
    public static void printlength(StringLengthlambda S){
        System.out.println(S.getlength("hai there "));
    }

}
