package com.company;

import java.util.Scanner;

public class Main {

    public static int mergesort(int arr[],int l,int h){

        if(l >= h)
            return 1;

        int mid = l + (h-l)/2 ;
        int x = mergesort(arr,l,mid);
        int y = mergesort(arr,mid+1,h);
        int z = checksorted(arr,l,h);

        if (z != 0){
            return z;
        }
        else if (x > y){
            return x;
        }
        return y;

    }


    public static int checksorted(int arr[],int l,int h){

        for (int i=l ; i<h ; i++){

            if (arr[i] > arr[i+1]){
                return 0;
            }
        }
        return h-l+1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }

            System.out.println(mergesort(arr,0,n-1));

        }
    }
}
