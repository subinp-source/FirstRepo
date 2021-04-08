package com.MyTrial.javaexamples;
public class Human {
        private String firstName;
        private String lastName;
        private int age;

        public Human(String a ,String b,int c){
            this.age=c;
            this.firstName=a;
            this.lastName=b;
        }

        public String getFirstName(){
            return firstName;
        }
        public void setFirstName(String s){
            this.firstName=s;
        }
        public String getLastName(){
            return lastName;
        }
        public void setLastName(String s){
            this.lastName=s;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int a){
            this.age=a;
        }
    public String toString(){
        return "firstname is = "+firstName+" last name is = "+lastName+" and age is = "+age;
    }

    }
