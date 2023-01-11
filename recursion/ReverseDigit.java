package com.recursionPractice.recursion;

public class ReverseDigit {
    static void reverseNumPrint(int num){
        if(num<10){
            System.out.println(num);
        }
        else {
            System.out.print(num%10);
            reverseNumPrint(num/10);   //for remaining number
        }
    }
    public static void main(String[] args) {
        int num = 1234;
        reverseNumPrint(num);
    }
}
