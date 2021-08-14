package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ; i<T ; i++){

            String str = sc.next();
            String s ;
            int sum =0 ;

            for(int j=0 ; j< str.length() ;j++){

                for(int k=j+1 ; k< str.length() ; k++){

                    if(k < (str.length()-1)){

                        s = str.substring(j,k+1);
                    }else{

                        s = str.substring(j,str.length());
                    }

                    if(s.contains("aman")){

                        sum += 1;
                    }
                }
            }
            System.out.println(sum);
        }

    }
}

/* QUESTION :-

  Aman String
Aman has string
s
t
r
, consisting of lowercase English alphabets. He wants to find the number of such pairs of indices
(
i
,
j
)
(
1
≤
i
≤
j
≤
|
s
t
r
|
)
 such that string
S
(
i
,
j
)
 contains at least once the string aman as a substring.

Input Format
The first line contains an integer
T
, denoting the number of test cases.
Each test case contains a non-empty string of
s
t
r
.

Output  Format
Print a single number — the answer to the problem.

Constraints
1
≤
T
≤
10

1
≤
|
s
t
r
|
≤
10
3
, where
|
s
t
r
|
 represents the length of the string.

Time Limit
1 second

Examples
Input
2
amanmgnaa
amanaaamanc

Output1
6
20

Explanation of sample test cases.
In the first sample, the following pairs
(
i
,
j
)
 match: (1, 4), (1, 5), (1, 6), (1, 7), (1, 8), (1, 9).

In the second sample, the following pairs
(
i
,
j
)
 match: (1,  4), (1,  5), (1,  6), (1,  7), (1,  8), (1,  9), (1,  10), (1,  11), (2,  10), (2,  11), (3,  10), (3,  11), (4,  10), (4,  11), (5,  10), (5,  11), (6,  10), (6,  11), (7,  10), (7,  11).


 */