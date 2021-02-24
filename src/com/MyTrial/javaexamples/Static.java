package com.MyTrial.javaexamples;
class cax{
    public static int age;
    public static String name;
    public int ages;
    public String names;
    public final static int num=23;
}

public class Static {
    public static void main(String[] args){
        cax cax1 = new cax();
        cax1.ages=21;
        cax.age=46;
        cax1.names="ravi";
        cax.name="raju";
        System.out.println(cax.name);
        System.out.println(cax.age);
        System.out.println(cax.num);
    }
}
