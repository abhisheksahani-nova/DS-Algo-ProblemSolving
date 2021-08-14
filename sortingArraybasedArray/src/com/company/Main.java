package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pop[] = new int[n];
        int home[] = new int[n];
        String cont[] = new String[n];

        for (int i = 0; i<n ; i++){

            cont[i] = sc.next();
            pop[i] = sc.nextInt();
            home[i] = sc.nextInt();
        }

        for (int i=0 ;i<n ;i++){

            System.out.println(cont[i]+" ");
        }
        for (int i=0 ;i<n ;i++){

            System.out.println(pop[i]+" ");
        }
        for (int i=0 ;i<n ;i++){

            System.out.println(home[i]+" ");
        }




    }
}
