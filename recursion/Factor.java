package com.recursionPractice.recursion;

public class Factor {
    static void factor(int n,int i){
        if(i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            factor(n,i+1);
        }
    }
    public static void main(String[] args) {
        int N = 8;
        factor(N,1);
    }
}
