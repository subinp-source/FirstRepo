package com.MyTrial.javaexamples;

public class Flora {

    public static void main(String[] args){
        Plant plant1= new Plant();
        Trees trees1=new Trees();
        Plant plant2=trees1;
        plant2.grow();
        trees1.leavesshedding();;
        dogrow(trees1);
    }

    public static void dogrow(Plant plant){
        plant.grow();
    }
}
