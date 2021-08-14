package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();
        for (int j=0 ; j<t ; j++) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println((n - 1) / 2);
            
        }
    }
}

/*  QUESTION :-

The Last Game
Mathematics marks of
N
 students are arranged in an array and two teachers are forming a team each for Maths Olympiad.
They select students turn wise, in each turn, they select a student marks and removes it from the array. This goes on until only one mark is left in the array. Considering teacher1 takes the first turn, can you tell us which mark will be left in the array after
N
−
1
 turns.

Initially, there are
N
 integers written on the board. Each turn a player selects one number and erases it from the board. This continues until there is only one number left on the board, i.e.
N
−
1
 turns are made. The first player makes the first move, then players alternate turns.

The first player wants to minimize the last number that would be left on the board, while the second player wants to maximize it.

You want to know what number will be left on the board after
N
−
1
 turns if both players make optimal moves.

Input Format
The first line contains an integer
T
, number of test cases. Then follows
T
 test cases. Each test case consists of two lines.
The first line contains
N
, i.e. the size of the array. The second line contains
N
 space-separated positive integers
A
[
i
]
 denoting elements of the array.

Output Format
The output contains
T
 lines, for every line print last remaining number.

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
6

1
<=
A
[
i
]
<=
10
6

Time Limit
1 second

Example
Input
2
3
2 1 3
3
2 2 2

Output
2
2



 */
