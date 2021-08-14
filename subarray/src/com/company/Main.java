package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3};

        for (int i =0; i< arr.length;i++){

            for (int j=i; j< arr.length;j++){

                for (int k = i; k<=j ;k++){
                    System.out.print(arr[k]);

                }
                System.out.println();

            }

        }






    }
}
