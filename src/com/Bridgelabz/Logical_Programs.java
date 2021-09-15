package com.Bridgelabz;
import java.util.*;
public interface Logical_Programs {

    public static void main(String[] args) {

        System.out.println("welcome to logical programs");
        System.out.println("Enter the how many times flip the coin");
        Scanner sc = new Scanner(System.in);
        int flip_value = sc.nextInt();
        double random_value = (int)Math.floor((Math.random()%10)*2);
        if(random_value < 0.5){
            System.out.println("TAIL");
        }
        else {
            System.out.println("HEAD");
        }
    }
}
