package com.MyTrial.javaexamples;

public class MultipleArrays {
    public static void main(String[] args){
        String[][] word = new String[3][3];
        word[0][0]="hello";
        word[0][1]="how are";
        word[0][2]="you";
        word[1][0]="iam ";
        word[1][1]="subin";
        word[1][2]="here";
        word[2][0]="and";
        word[2][1]="what about";
        word[2][2]="you";
        for (int i=0;i< word.length;i++){
            for (int j=0;j< word[i].length;j++){
                System.out.print(word[i][j]+" ");}
            System.out.println();

        }
    }
}
