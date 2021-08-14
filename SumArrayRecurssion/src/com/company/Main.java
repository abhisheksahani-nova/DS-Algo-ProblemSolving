package com.company;

import java.util.Scanner;

public class Main {


    public static int sumArray(int arr[],int n,int index){

        if (index == n)
            return 0;


        return arr[index] + sumArray(arr, n, index + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {

                arr[j] = sc.nextInt();
            }

            int index = 0;

            System.out.println(sumArray(arr,n,index));

        }
    }
}
