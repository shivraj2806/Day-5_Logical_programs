package com.Bridgelabz;

import java.util.Scanner;

public class Swaping_Numbers {
    public static void main(String[] args) {
        int i, n, t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        i = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Before swapping numbers: "+i +"  "+ n);
        /*swapping */
        t = i;
        i = n;
        n = t;
        System.out.println("After swapping number : "+i +"   "+ n);
    }
}

