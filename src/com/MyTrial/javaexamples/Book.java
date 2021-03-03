package com.MyTrial.javaexamples;

public class Book implements Showinfo,Publisher{
      public int age=7;
      public void read(){
          System.out.println("reading started");
      }

    @Override
    public void showinfo() {
       System.out.println("the age of the book is :"+age);
    }

    @Override
    public void Nameofpublisher() {
        System.out.println("DC BOOKS");
    }
}
