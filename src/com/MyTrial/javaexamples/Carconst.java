package com.MyTrial.javaexamples;
class car{
   private String color;
   private int age;
   public car(String colors,int ages){
       color=colors;
       age=ages;
   }
   public car(car cars){
       System.out.println("copy constructor invoked");
       color=cars.color;
       age=cars.age;
   }
   public String showcolor(){
       return color;
   }
   public int showage(){
       return age;
   }

}

public class Carconst {
    public static void main(String[] args){
     car car1=new car("red",5);
     System.out.println("the color of car is "+car1.showcolor());
     System.out.println("the age is  "+car1.showage());
     car car2=new car(car1);
     System.out.println("the color of the car is "+car2.showcolor());
     System.out.println("the age of the car is "+car2.showage());

    }
}
