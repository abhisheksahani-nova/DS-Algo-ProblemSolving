package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0 ; i<T ; i++){

            String str = sc.next();
            int freq[] = new int[26];
            char ch ;
            int flag=0 ;
            int num;

            for(int j=0 ; j<str.length() ; j++){

                freq[(int)str.charAt(j) - (int)'a']++ ;
            }

            for(int j=0 ; j<26 ;j++){

                if(freq[j] > 1){
                    num = j + (int)'a' ;
                    ch = (char)num ;
                    System.out.print(ch+ "=" + freq[j] + " ");
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("-1");
            }
            System.out.println();


        }
    }
}

/* QUESTION :-

  Duplicate Character
Tina is given a string
S
 which contains the first letter of all the student names in her class. She got a curiosity to check how many people have their names starting from the same alphabet. So given a string
S
, she decided to write a code that finds out the count of characters that occur more than once in the string.

Input format
The first line contains an integer
T
, denoting the number of test cases.
Each test case consists of a string
S
 containing only lowercase characters.

Output format
For each test case on a new line, print the output in the format character=count. If multiple characters have more than one count, print all of them separated by space, in alphabetical order.
In case no such character is present print
−
1
.

Constraints
1
<=
T
<=
7

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
3

prepbytes
java
algorithm

Output
e
=
2

p
=
2
￼
a
=
2
￼
−
1

Sample test case explanation
In the first string character p is occuring
2
 times and character e is occuring
2
 times. Printing them in alphabetical order we get,
e = 2
p = 2

 */