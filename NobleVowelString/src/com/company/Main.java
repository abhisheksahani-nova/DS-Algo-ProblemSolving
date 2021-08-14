package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char ch;
        for (int i = 0; i < T; i++) {

            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {

                ch = str.charAt(j);

                if (j == (str.length() - 1)) {

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'n') {
                        System.out.println("YES");
                        break;
                    } else {
                        System.out.println("NO");
                        break;
                    }

                }


                if (isVowel(ch)) {
                    continue;

                } else if (ch == 'n') {

                    continue;

                } else {

                    ch = str.charAt(j + 1);
                    if (isVowel(ch)) {
                        continue;
                    } else {
                        System.out.println("NO");
                        break;
                    }
                }
            }

        }
    }

    public static Boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}