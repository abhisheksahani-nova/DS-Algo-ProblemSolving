package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ; i<T ; i++){

            String str[] = new String[2];

            long x = 0 ;
            long y = 1 ;

            for(int j=0 ; j<2 ;j++){

                str[j] = sc.next();
            }

            for(int j=0 ; j<2 ;j++){

                x = 0 ;
                for (int k=0 ; k < str[j].length() ; k++){

                    x = x * 10 + ((int)str[j].charAt(k) - (int)'0') ;

                }
                y = y * x ;
            }
            System.out.println(y);

        }


    }
}
