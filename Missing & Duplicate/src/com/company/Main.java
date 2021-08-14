package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        int[] result = new int[2];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for( int i=0 ; i < n ; i++){

            sum += arr[i];

            if(i != arr[i]-1){

                result[0] = arr[i] ;
                break;
            }
        }
        int total = n*(n+1)/2;
        result[1] = total - sum;

        System.out.print(result[0] +" "+ result[1]);
    }
}
