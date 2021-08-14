package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0 ; i<T ; i++){
            int N = sc.nextInt();
            int arr[] = new int[N-1];

            long tot = (long) N*(N+1)/2 ;
            long sum =0;

            for(int j=1; j<=N-1 ; j++){

                sum = (long)sum + arr[j];

            }
            long ans = tot - sum ;
            System.out.println(ans);
        }



    }
}
