package com.company;

import java.util.Scanner;

public class Main {

    public static void storeAllPosition(int arr[],int pos[],int n,int i, int j,int value){

        if (i == n){
            for (int k =0; k< pos.length;k++){

                System.out.print(pos[k]+" ");
            }
            return;
        }

        if (arr[i] == value)
            pos[j++] = i;

        storeAllPosition(arr, pos, n, i+1, j, value);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int r = 0; r < t; r++) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int m = 0; m < n; m++) {

                arr[m] = sc.nextInt();
            }
            int value = sc.nextInt();
            int i = 0;
            int j = 0;
            int count =0;

            for (int x =0 ; x<n; x++){

                if (arr[x] == value)
                    count ++;
            }

            int pos[] = new int[count];
            storeAllPosition(arr,pos,n,i,j,value);

        }
    }
}
