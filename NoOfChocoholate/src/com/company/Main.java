package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for (int i=1 ; i<=n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        int q = sc.nextInt();
        int query[] = new int[q+1];

        for (int i=1 ; i <= q ;i++ ){

            query[i] = sc.nextInt();

        }

        int mid = 0;

        for (int i = 1 ; i<=q ;i++){

            int start = 1 ;
            int end = n;
            int count = 0;

            if (arr[n] < query[i]){
                count = n;
            }
            else{

                while (start <= end){

                    mid = start + (end - start)/2 ;


                    if (arr[mid] > query[i]) {
                        count = mid - 1;
                        end = mid - 1;
                    }
                    else{
                        count = mid;
                        start = mid + 1;


                    }
                }
            }
            System.out.println(count);

        }

    }
}


/* QUESTION :-

 Number of Chocolates
You are given an array of prices of chocolates. The length of array is
N
 (given). You need to answer
q
 queries. Each query consists of single integer
x
 denoting the amount you have. Now you need to output the number of chocolates you can choose from to buy.

Input:
First line contains one integer
N
 denting the size of array.
Second line contains
N
 space-separated integers
a
[
i
]
,
i
=
1
t
o
N
 denoting the cost of chocolates.
Third line contains a single integer
q
,
q
 lines follow each denoting an integer
x
.

Output:
Print
q
 lines denoting the answer for that query.

Constraints:
1
≤
n
≤
10
5

1
≤
a
[
i
]
≤
10
5

1
≤
q
≤
10
5

1
≤
x
≤
10
5

Time Limit
2 seconds

Sample Input
3
6 3 1
4
4
1
5
2

Sample Output
2
1
2
1


 */