package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0 ; i<T ; i++) {
            int N = sc.nextInt();
            String str = sc.next();

            int freq[] = new int[4];

            for (int j = 0; j < N; j++) {

                freq[(int) str.charAt(j) - (int) 'A']++;
            }

            if (freq[0] > freq[3]) {
                System.out.println("Aditya");

            } else if (freq[0] < freq[3]) {
                System.out.println("Danish");

            } else {
                System.out.println("AdiDan");
            }

        }

    }
}


/* Better Algorithm to same problem without using array :-


####  Also u can solve it without using array just take input character by character like this:
      int c=0; //for count
      for(int i = 0; i < str.length(); i++)
          if(str.charAt(i)==‘A’)
             c++;
           else
             c--;

       System.out.println(c>0? “Aditya” :   c < 0? “Danish” : “AdiDan”);


####



###  Problem Statement -

  Aditya and Danish are great chess players and they want to know who is the better player. So they play
N games in a row. For each game, we noted down the winner- Aditya or Danish. There was no tie.
Now they are tired of playing the game and want you to find out who won more games.

Input format
The first line contains an integer
T
, denoting the number of test cases.
For each test case
First-line contains an integer
N
, denoting the length of the string.
The second line contains a string with
N
 characters and each character is either A or D where A means Aditya won and D means Danish won.

Output format
For each test case on a new line,

Print Aditya if Aditya wins more number of games.
Print Danish if Danish wins more number of games.
Print AdiDan is both have equal number of wins.
Constraints
1
<=
T
<=
10

1
<=
N
<=
10
7

Time limit
1
 ​secon

Example
Input
3

6

ADAAAA
7

DDDAADA
6

DADADA

Output
Aditya
Danish
AdiDan



 */


