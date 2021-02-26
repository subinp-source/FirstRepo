package com.MyTrial.javaexamples;

public class Director {
    protected int age;
    protected String name;
    protected int number;
    protected String address;
    protected int salary;

    public void printsalary(){
        System.out.println("salary is :"+salary);
    }
    public static void main(String[] args){

        Employee employee1 = new Employee();
        employee1.showemployee();
        employee1.printsalary();
        Manager manager1 = new Manager();
        manager1.showmanager();
        manager1.printsalary();
    }

}
