package com.MyTrial.javaexamples;

public class Switchexp {
    public static void main(String[] args) {
        String text = "start";
        switch (text) {
            case "start":
                System.out.println("machine will start");
                break;
            case "stop":
                System.out.println("machine stopped");
                break;
            default:
                System.out.println("no working");

        }
    }
}
