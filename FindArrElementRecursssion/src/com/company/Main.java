package com.company;

import java.util.Scanner;

public class Main {


    public static boolean findArrElement(int arr[],int n,int index,int value){

        if (index == n)
            return false;

        if (arr[index] == value)
            return true;

        return findArrElement(arr,n,index+1,value);

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
            int value = sc.nextInt();

            System.out.println(findArrElement(arr,n,index,value));


        }
    }
}
