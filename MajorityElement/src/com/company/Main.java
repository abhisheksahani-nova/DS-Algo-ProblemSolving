package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{4,9,1,9,6,9,9,9};


        for (int i=0; i<8 ; i++) {
            int sum = 0;

            for (int j = 0; j < 8; j++) {

                if (arr[i] == arr[j]) {
                    sum = sum + 1;
                }
            }
            if (sum > 8 / 2) {
                System.out.println(arr[i] + " is a majority element");
                break;
            }

        }
    }
}
