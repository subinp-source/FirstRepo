package com.MyTrial.javaexamples;

public class Story implements Showinfo,Publisher {

    private String name;
    public Story(String abc){
        this.name=abc;
    }
    public void showhero(){
        System.out.println("his name is aladdin");
    }

    @Override
    public void showinfo() {
        System.out.println("the name of the story is :"+name);
    }

    @Override
    public void Nameofpublisher() {
        System.out.println("DC BOOKS PUBLISHERS");
    }
}
