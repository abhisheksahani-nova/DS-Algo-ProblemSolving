package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            int num = n;
            int count =0;

            while (num != 0){

                num = num/10;
                count++;
            }
            int arr[] = new int[count];

            for (int i=0 ;i<count;i++){

                arr[i] = n % 10 ;
                n = n/10;
            }
            Arrays.sort(arr);

            int flag = 0;

            for (int i=1 ; i<count;i++){

                if(arr[i] != (arr[i-1] + 1) ){
                    flag=1;
                    break;
                }
            }
            if (flag==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
