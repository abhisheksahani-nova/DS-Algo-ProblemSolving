package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int freq[] = new int[n];
        int flag = 0;

        for(int j=0 ; j<n ; j++){

            arr[j] = sc.nextInt();
        }
        int k = sc.nextInt();

        for(int j=0 ; j<n ; j++){

            freq[arr[j]]++ ;
        }
        int j;
        for( j=0 ; j<n ; j++){

            if(freq[j] == k){
                flag = 1 ;
                break;
            }
        }

        if(flag == 1){
            System.out.println(j);
        }
        else{
            System.out.println("-1");
        }

    }
}
