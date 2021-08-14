package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t ; i++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int flag =0;

            for (int j = 0; j < n; j++) {

                arr[j] = sc.nextInt();
            }


            int j ;
            for (j =0; j < n-1; j++) {

                if (arr[j] > arr[j + 1]) {
                    flag = 1;
                    break;

                }

            }
            int k;
            for (k = n-1; k >= 1; k--) {

                if (arr[k] < arr[k-1]){
                    flag =1;
                    break;


                }
            }
            if (flag == 0){
                System.out.println(k+" "+j);
            }
            else if (flag == 1){
                System.out.println(j+" "+k);

            }

        }
    }
}
