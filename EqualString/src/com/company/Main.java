package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ;i<T ;i++){

            int N = sc.nextInt();
            String[] str = new String[N];
            int z= 0;
            int flag = 0;
            int sum =0;

            for(int j=0 ;j<N ; j++){

                str[j] = sc.next();
            }
            String a = str[0];

            for(int j=1 ; j< N;j++){

                String x = str[j];

                if (a == x){
                    continue;

                }else{

                    for (int k=0 ;k < a.length()-1 ;k++){

                        z = rotate(a,x);
                        sum = sum + 1 ;

                        if (z == 1){
                            break;
                        }else{
                            continue;
                        }
                    }
                }

            }
            System.out.println(sum);

        }
    }
    public static int rotate(String s , String x){

        char temp = x.charAt(0);
        char a;
        char b;
        char c;
        for (int i=0 ;i< (x.length()-1) ;i++){
            c = x.charAt(i);
            a = x.charAt(i+1);

            c = a;
        }
        b = x.charAt(x.length()-1);
        b= temp;

        if (s==x){
            return 1 ;
        }else {
            return -1;
        }
    }
}
