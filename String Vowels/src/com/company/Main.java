package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int i=0; i<T ;i++){

            String str = sc.next();
            int count = 0;


            for(int j=0 ; j<str.length() ; j++){

                char ch = str.charAt(j);
                if(ch == 'A' || ch =='E' || ch =='I' || ch == 'O' || ch=='U'){

                    count++ ;

                }
            }
            int cosonant = str.length() - count;
            System.out.println(count + " " + cosonant);

        }
    }
}
