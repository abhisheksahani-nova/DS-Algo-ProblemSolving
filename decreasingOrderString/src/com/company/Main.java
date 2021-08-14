package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int freq[] = new int[26];
        int num = 0;
        int sum = 0;
        char ch ;

        for(int j=0 ; j<T ; j++){

            String str = sc.next();

            for(int i=0 ; i<str.length() ; i++ ){

                freq[(int)str.charAt(i) - (int)'a']++ ;
            }
            for(int i=25 ; i>=0 ; i--){

                num = freq[i];

                for(int k =0 ; k<num ; k++){

                    sum = i + 97 ;
                    ch = (char)sum ;

                    System.out.print(ch);

                }

            }
            Arrays.fill(freq,0);
            System.out.println();
        }
    }
}
