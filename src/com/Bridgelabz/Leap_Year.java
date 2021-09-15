package com.Bridgelabz;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        sc.close();
        if (year >= 999)
            getLeapYear(year);
        else
            System.out.println("Please Enter Year in 4 Digits");
    }
    public static void getLeapYear(int year) {

        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("It an leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}

