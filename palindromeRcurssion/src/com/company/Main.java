package com.company;

import java.util.Scanner;

public class Main {


    static boolean palindrome(String str, int s, int e){

        if (str.charAt(s) != str.charAt(e))
            return false;

        if (s < e)
            return palindrome(str,s+1,e-1);

        return true;



    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String str = sc.next();
            int s = 0;
            int e = str.length()-1 ;

            if (str.isEmpty()) {
                System.out.println("Yes");

            }
            if (palindrome(str,s,e)) {
                System.out.println("Yes");

            }else{
                System.out.println("No");
            }


        }

    }
}
