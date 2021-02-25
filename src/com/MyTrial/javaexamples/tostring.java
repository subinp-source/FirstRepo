package com.MyTrial.javaexamples;
class lion{
    private int age;
    private String name;
    public lion(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("my age is ").append(age).append(" ").append("and my name is  ").append(name);
        return s.toString();
    }
}

public class tostring {
    public static void main(String[] args){
        lion cub = new lion(15,"singam");
        System.out.println(cub);
    }
}
