package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0 ; i<t ; i++){

            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];

            for(int j=0 ; j<n ; j++){

                arr1[j] = sc.nextInt();
            }

            for(int j=0 ; j<n ; j++){

                arr2[j] = sc.nextInt();
            }

            int count=0;
            int j=0;

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for(int k=0 ; k<n ;k++){

                if(arr1[k] <= arr2[j])
                    continue;

                if(arr1[k] > arr2[j]){
                    count++;
                    j++;

                }
            }
            System.out.println(count);
        }
    }
}
