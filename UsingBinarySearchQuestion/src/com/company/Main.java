package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t ;j++){

            int n = sc.nextInt();
            int arr[] = new int[n];


            for(int i=0 ;i<n ;i++){

                arr[i] = sc.nextInt();
            }
            int s=0;
            int e=n-1;
            int m;

            if(arr[n-1] == 0){

                System.out.println("-1");
            }
            else{

                while(s <= e){

                    m = s + (e-s)/2 ;

                    if(arr[m] == 1 && (m == 0 || arr[m-1] == 0)){
                        System.out.println(m);
                        break;
                    }
                    else if(arr[m] == 0){

                        s = m + 1 ;
                    }
                    else{
                        e = m - 1 ;
                    }
                }
            }
        }

    }
}

/*  Question :-  Transition Point
Tina is a computer scientist and a part of her work requires her to find first occurence of
1
 in the array consisting of
0
 and
1
. One good news is that array is sorted. Tina is sure that a sorted array will give solution to this problem in more efficient way. Can you write code to find first occurence of
1
 in the array consisting of
0
 and
1
.

Input
First line contains an integer
T
, number of test cases. Then follows
T
 test cases. Each test case consists of two lines.
First line contains
N
, length of the array(
0
-based indexing). Second lines contains
N
 space separated integers
0
 and
1
.

Output
Print
T
 lines, each containing index of first occurence of
1
 if it exists else print
−
1
.

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
5
∗
10
6

A
[
i
]
=
0
|
1

Time Limit
1 second

Example
Input
2
5
0 0 1 1 1
4
0 0 0 0

Output
2
-1


 */