package com.company;

import java.util.Scanner;

public class Main {

    public static double geoSum(int k){

        if (k==0)
            return 1;

        double x = pow(k);

        return (1/x) + geoSum(k-1);
    }

    public static double pow(int k){

        if (k==0)
            return 1;

        return 2 * pow(k-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        System.out.println(geoSum(k));
    }
}
