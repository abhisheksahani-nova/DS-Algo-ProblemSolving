package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            int arr[] = new int[n];


            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int x = sc.nextInt();
            int s = 0;
            int e = n-1;
            int piv = pivot(arr,n,s,e);

            if (piv == -1){
                System.out.println("-1");

            }
            else if(arr[piv] == x){

                System.out.println(piv);

            }
            else if (x >= arr[s]){

                System.out.println(binarySearch(arr,s,piv-1,x));
            }
            else if(x <= arr[e]){
                System.out.println(binarySearch(arr,piv+1,e,x));
            }
        }
    }

    static int pivot(int arr[],int n,int s,int e){

        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2 ;

        if(arr[mid+1] < arr[mid] && mid < e)
            return mid+1;

        if (arr[mid-1]  > arr[mid] && mid > s)
            return mid;

        if (arr[0] > arr[mid])
            return pivot(arr,n,s,mid-1);

        return pivot(arr,n,mid+1,e);
    }

    static int binarySearch(int arr[],int s,int e,int x){

        if (s > e){
            return -1;
        }
        int mid = s + (e-s)/2 ;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] > x)
            return binarySearch(arr,s,mid-1,x);

        return binarySearch(arr,mid+1,e,x);

    }
}

/* QUESTION :-

Rotate and Find
We are assuming you have gone through lectures of array rotation till now and you are comfortable with it and you also must have solved good numbers of searching problems. So, we thought why not to combine rotation and searching and create a problem statement for you. So you are given a rotated array
A
 and an integer
x
, your task is to find the index of
x
.

Oh! One more thing. Before you start thinking of using linear search let me inform you the array is sorted and rotated.

Input format
First line contains an integer
T
, number of test cases. Then follows
T
 test cases. Each test case consists of three lines.
The first line contains
N
.
Second lines contain
N
 space separated integers and the third line contains an integer
x

Output format
Print
T
 lines, each containing index of
x
 in
A
. Print
−
1
 if
x
 is not present in the array.

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
2
∗
10
6

Example
Input
3
9
5 6 7 8 9 10 1 2 3
10
3
3 1 2
1
4
3 5 1 2
6

Output
5
1
-1



 */