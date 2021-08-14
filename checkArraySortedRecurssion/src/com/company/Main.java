package com.company;

import java.util.Scanner;

public class Main {


    public static String checkSorted(int arr[],int n,int index){

        if(index == n-1)
            return "Yes";

        if (arr[index] <= arr[index + 1]) {

            return checkSorted(arr, n, index + 1);
        }
        else{
            return "No";
        }

    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0 ; i<t ; i++){

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int j=0 ; j<n ; j++){

                arr[j] = sc.nextInt();
            }
            int index = 0;

            System.out.println(checkSorted(arr,n,index));


        }
    }
}
