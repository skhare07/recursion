package com.recursionPractice.recursion;

public class PrintNum {
    static void printNum(int n) {
        if (n <= 10) {
            printNum(n + 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
