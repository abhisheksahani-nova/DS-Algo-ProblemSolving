package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int i=0; i<T; i++){

            int N=sc.nextInt();
            int arr[] =new int[N];

            for(int j=0; j<N ; j++){

                arr[j] = sc.nextInt();
            }
            for(int j=0; j<N ; j++){

                if(j==0){
                    if(arr[j] > arr[j+1]){
                        System.out.print(j+" ");
                    }
                }else if(j>0 && j<N-1){
                    if(arr[j] > arr[j-1] && arr[j] > arr[j+1]){
                        System.out.print(j+" ");
                    }
                }else if(j==N-1){
                    if(arr[j] > arr[j-1]){
                        System.out.print(j+" ");
                    }
                }


            }
            System.out.println();






        }
    }
}
