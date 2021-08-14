package com.company;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[]{2,1,5,3,4,9,10,8,7,7};

        int xor = 0;
        int set_bit;
        int x = 0;
        int y = 0;

        for (int i=0; i<arr.length ; i++){

            xor = xor ^ arr[i];
        }

        for(int i=1 ; i<=arr.length ;i++){

            xor = xor ^ i;
        }

        set_bit = xor & -xor;

        for(int i=0 ; i< arr.length ; i++){

            if((arr[i] & set_bit) == 0){
                x = x ^ arr[i];
            }else{
                y = y ^ arr[i];
            }
        }

        for (int i=1 ; i <= arr.length ; i++){

            if((i & set_bit) == 0){
                x = x ^ i;
            }else{
                y = y ^ i;
            }
        }

        for(int i=0 ; i < arr.length ; i++){

            if(x == arr[i]){
                System.out.println(x);
                System.out.println(y);
                break;
            }else{
                System.out.println(y);
                System.out.println(x);
                break;
            }
        }

    }
}
