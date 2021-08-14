package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int d = sc.nextInt();

       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();

       }

       for (int i=0; i<(n-d)/2; i++){

            int temp = arr[i];
            arr[i] = arr[n-d-i-1];
            arr[n-d-i-1] = temp;
       }
       int k = 0;
       for (int i=n-d; i<n-1-k; i++){

            int temp = arr[i];
            arr[i] = arr[n-1-k];
            arr[n-1-k] = temp;
            k++;
       }
       for (int i=0 ; i<n/2 ; i++) {
           int temp = arr[i];
           arr[i] = arr[n - i - 1];
           arr[n - i - 1] = temp;

       }
       for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");


       }
    }
}
