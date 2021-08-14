package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ; i<T ;i++){

            String str = sc.next();
            char ch ;
            char last;
            char first;
            int sum = 0;
            int a;

            for(int j=0 ;j<(str.length()/2) ; j++){

                last = str.charAt(str.length()-1-j) ;
                first = str.charAt(j) ;

                if(first == last){

                    continue;

                }else if(first < last){

                    while(first != last){

                        a = (int)last - 1;
                        ch = (char)a ;
                        last = ch ;
                        sum += 1;
                    }
                }else{

                    while(first != last){

                        a = (int)first - 1;
                        ch = (char)a ;
                        first = ch ;
                        sum += 1;
                    }
                }


            }
            System.out.println(sum);
        }

    }
}

/* QUESTION :-

  Chatur's Exam Paper
We all know Chatur and Rancho from
3
 idiots. Rancho got Chatur exam paper, but since he is a prankster, he decided to meddle with the words present in the paper. He changes all the words in the paper into palindromes.
To do this, he follows two rules:
1. In one operation he can only reduce the value of an alphabet by
1
, i.e he can change
d
 to
c
, but he cannot change
c
 to
d
 or
d
 to
b
.
2. The alphabet
a
 will not be reduced any further.

Each reduction in the value of any alphabet is counted as a single operation.
Find the minimum number of operations required to convert a given string into a palindrome.

Input format
The first line contains an integer
T
, denoting the number of test cases.
Each test case consists of a string
S
 containing only lowercase characters with no spaces.

Output format
For each test case on a new line, print the minimum number of operations for the corresponding test case.

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
4

abc
abcba
abcd
cba

Output
2

0

4

2

Sample test case explanation
For the first test case
string =
a
b
c

c
->
b
->
a

so the string become
a
b
a
 which is a palondrome. For this we perform
2
 operations.



 */