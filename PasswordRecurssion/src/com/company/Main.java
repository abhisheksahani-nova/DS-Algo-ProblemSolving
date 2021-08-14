package com.company;

import java.util.Scanner;

public class Main {


    static void password(int a, int l){

        if (l==1 && a>9)
            return;
        if (l==2 && a>99)
            return;
        if (l==3 && a>999)
            return;
        if (l==4 && a>9999)
            return;

        if (!(String.valueOf(a).contains("0")))
            System.out.println(a);

        password(a+1,l);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int l = sc.nextInt();
            int a ;

            if (l==1){
                a = 1;
                password(a,l);

            }else if (l==2){
                a = 11;
                password(a,l);

            }else if (l==3){
                a = 111;
                password(a,l);

            }else if (l==4) {
                a = 1111;
                password(a, l);
            }
        }

    }
}
