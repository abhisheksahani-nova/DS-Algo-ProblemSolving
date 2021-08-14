package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {

                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            HashSet<Integer> hs = new HashSet<>();

            for (int j = 0; j < n; j++) {

                hs.add(arr[j]);
            }
            int max = 0;
            int x = 0;
            int y = 0;
            int flag = 0;


            for (int j = n-1; j > 0 ; j--) {

                for ( int k = j-1 ; k >= 0; k--) {

                    if (hs.contains(arr[j]+arr[k])){

                        flag=1;

                        if ((arr[j]+arr[k]) > max){
                            max = arr[j]+arr[k];

                            if (arr[j] < arr[k]) {
                                x = arr[j];
                                y = arr[k];
                            }else{
                                x = arr[k];
                                y = arr[j];
                            }

                        }
                        break;
                    }
                }
            }
            if (flag == 1){
                System.out.println(max+" "+x+" "+y);
            }
            else{
                System.out.println("-1");
            }

        }
    }
}
