package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i<T; i++){

            double h = sc.nextInt();
            double m = sc.nextInt();
            double hourh = (h * 30) + (m * 0.5);
            double minh = (m * 6);
            double ang = Math.abs(hourh - minh);

            if(ang>180){
                ang = 360 - ang;
            }
            int a = (int) ang;

            System.out.println(a);



        }

    }
}
