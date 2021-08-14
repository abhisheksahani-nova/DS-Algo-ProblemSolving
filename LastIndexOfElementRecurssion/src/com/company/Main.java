package com.company;

import java.util.Scanner;

public class Main {


    public static int lastindex(int arr[],int n,int index,int value,int pos){

        if (index == n)
            return pos;

        if (arr[index] == value)
            pos = index;

        return lastindex(arr, n, index+1, value, pos);

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
            int value = sc.nextInt();
            int index = 0;
            int pos = -1;

            System.out.println(lastindex(arr,n,index,value,pos));




        }
    }
}
