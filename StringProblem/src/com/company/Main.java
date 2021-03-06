package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ; i< T ;i++){

            String str = sc.next();
            int freq[] = new int [26];
            int sum = 0;
            int len = 0;

            for(int j=0 ; j<str.length() ; j++){

                freq[(int)str.charAt(j) - (int)'a']++ ;
            }

            for(int j=1 ; j<26 ; j++){

                sum = sum + freq[j] ;
            }

            if(freq[0] > sum){

                System.out.println(str.length());

            }else{

                sum = freq[0] - 1 ;
                len = freq[0] + sum ;
                System.out.println(len);
            }

        }



    }
}

/* Question :-

Tina Loves A
Tina has a string
S
. She really likes the letter a. She calls a string good if strictly more than half of the characters in that string are a's. For example "aaacb", "acaa" are good strings, and "baba", "abbba"," "(empty string) are not.
Tina can erase some characters from her string
S
. She would like to know what is the length of the longest string remaining after erasing some characters (possibly zero) to get a good string. It is guaranteed that the string has at least one a in it, so the answer always exists.

Input format
The first line contains an integer
T
, denoting the number of test cases.
Each test case consists of a string
S
 containing only lowercase characters.

Output format
For each test case on a new line, print the length of longest good string.

Constraints
1
<=
T
<=
10

1
<=
|
S
|
<=
10
7
, where
|
S
|
 denotes length of string
S
.

Time limit
1
 ​secon

Example
Input
2

xaxxxxa
aaabaa

Output
3

6


 */