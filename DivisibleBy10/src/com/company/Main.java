package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<=T; i++){
            int N = sc.nextInt();
            int mul;
            int ans = 0;

            if(N % 10 == 0){
                ans = 0;
            }else if(N % 5 == 0){
                mul = N * 2;
                if (mul % 10 == 0){
                    ans++;
                }
            }else{
                ans = -1;
            }
            System.out.println(ans);

        }
    }
}
