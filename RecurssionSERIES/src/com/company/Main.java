package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            printNum(n);
        }
    }

    static void printNum(int n){

        System.out.print(n+" ");

        if(n <= 0){
            return ;
        }
        printNum(n-5);

        System.out.print(n+" ");

    }
}

