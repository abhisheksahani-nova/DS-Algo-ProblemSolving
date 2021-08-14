package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){

            int N=sc.nextInt();
            int K=sc.nextInt();
            int arr[] = new int[N];
            for(int m=0 ; m<N ;m++){
                arr[m] = sc.nextInt();
            }

            if(K>=N){
                K= K % N ;
            }


            if(K == 0){
                for(int j=0 ; j<N ;j++){
                    System.out.println(arr[j]+" ");
                }
            }

            if(K<N) {
                for (int j = 0; j < (N - K) / 2; j++) {
                    int t = arr[j];
                    arr[j] = arr[N - K - j - 1];
                    arr[N - K - j - 1] = t;
                }
                int r = 1;

                for (int j = N - K; j < N - r; j++) {
                    int t = arr[j];
                    arr[j] = arr[N - r];
                    arr[N - r] = t;
                    r++;
                }

                for (int j = 0; j < N / 2; j++) {
                    int t = arr[j];
                    arr[j] = arr[N - j - 1];
                    arr[N - j - 1] = t;
                }

                for (int j = 0; j < N; j++) {
                    System.out.print(arr[j] + " ");
                }


            }
        }


    }
}
