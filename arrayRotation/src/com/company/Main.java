package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[]{1,2,3,4,5,6};
        int a[] = new int[n];

        for (int i=0 ; i<n ;i++){

            if(i+2 < n){
                a[i] = arr[i+2];
            }else{
                a[i] = arr[i+2-n];
            }
        }
        for (int i=0; i<n ;i++){
            System.out.print(a[i]+" ");
        }
    }
}
