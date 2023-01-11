package com.recursionPractice.recursion;

public class Even {
    static void evenCheck(int n) {
        if (n <= 10) {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            }
            evenCheck(n + 1);
        }
    }
    public static void main(String[] args) {
     evenCheck(1);
    }
}
