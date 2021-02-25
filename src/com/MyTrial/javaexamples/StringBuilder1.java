package com.MyTrial.javaexamples;

public class StringBuilder1 {
    public static void main(String[] args){
        //string builder
        StringBuilder s = new StringBuilder();
        s.append("how are you. ");
        s.append("iam reay to do that.").append("\teverything is ready");
        System.out.println(s.toString());
        //formatting integer
        System.out.printf("the age is %d\n",45);
        System.out.printf("height is about %5d",160);
        //formating float values
        System.out.printf("\nthe value of pi is %.2f",3.14);
        System.out.printf("\nthe value of pi is %.2f and value of mole is %.3f",3.14,6.3145);
    }
}
