package com.MyTrial.javaexamples;
class robot1{
    private String name;
    private int age;
   public void setname(String name){
       this.name=name;
       System.out.println(name);
   }
   public void setage(int age){
       this.age=age;
       System.out.println(age);
   }

}

public class SetterMethods {
    public static void main(String[] args){
        robot1 robo = new robot1();
        robo.setname("rahul");
        robo.setage(27);

    }
}

