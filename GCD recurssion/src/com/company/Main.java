package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println(gcd(num1,num2));
        }

    }

    static int gcd(int num1 , int num2){

        if (num1 <= 1 || num2 <= 1){
            return 1;
        }
        if (num1 == num2){
            return num1;
        }
        if (num1 > num2){
            return gcd(num1 - num2,num2);
        }

        return gcd(num1,num2-num1);

    }
}
