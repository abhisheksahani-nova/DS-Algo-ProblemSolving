package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int m = 0; m < t; m++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int diff[] = new int[n];
            int cd = 0;
            int index = 0;
            int max = 0;


            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i < n; i++) {

                cd = arr[i] - arr[i-1];
                diff[i] = cd;

            }
            for (int i = 1; i < n; i++) {

                if (diff[i] > max){
                    max = diff[i];
                    index = i;
                }
            }
            for (int i = 1; i < n; i++) {

                if (diff[i] != max){
                    cd = diff[i];
                    break;
                }
            }
           // System.out.println(cd);
            System.out.println(arr[index] - cd);
        }

    }
}


/* QUESTION :-


  Missing in AP
Arithmetic expression was an interesting concept that we learned in maths. What about solving a problem around that. Let's say I give you
N
 elements and I tell you that the elements are representing AP(Arithmetic Progression). But you realize that one element from this AP is missing and you want to find out the missing element. It is easy to find out the missing one for a human but can you write down a program that does this task of finding a missing element from the AP?

Input format
First line contains an integer
T
, number of test cases. Then follows
T
 test cases. Each test case consists of two lines.
First line contains
N
.
Second lines contain
N
 space separated integers.

Output format
Print
T
 lines, each line containing the missing element.

Constraints
1
<=
T
<=
10

3
<=
N
<
2
∗
10
6

1
<=
A
[
i
]
<=
10
7
+
5

Time Limit
1 second

Example
Input
2
5
1 4 10 13 16
5
1 5 9 17 21

Output
7
13





 */