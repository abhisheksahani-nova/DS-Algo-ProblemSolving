package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt() ;

        for(int i=0 ; i<T ;  i++){

            String str = sc.next();
            String st[] = new String[5];
            for (int j=0 ; j<5 ; j++){

                st[j] = sc.next();
            }

            String z ;
            char ch ;

            for (int j=0 ; j< 5 ;j++){

                z = st[j];

                for (int k =0 ; k<2 ; k++){

                    ch = z.charAt(k);
                    if (ch == str.charAt(k)){
                        System.out.println("YES");
                    }
                }
            }
            System.out.println("NO");
        }

    }
}
