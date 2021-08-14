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

            int major = 0;
            int count = 1;
            int x = 0;

            for (int i = 1; i < n; i++) {


                if (arr[i] == arr[major]) {
                    count++;
                } else {
                    count--;
                }

                if (count == 0) {

                    count = 1;
                    major = i;
                }
            }

            for (int i = 0; i < n; i++) {

                if (arr[i] == arr[major]) {

                    x++;
                }
            }

            if (x > n / 2) {
                System.out.println(arr[major]);
            } else {
                System.out.println("-1");

            }
        }

    }
}

/* Question :-  Majority Votes
There is a voting for class monitor in Tina's class. There were several candidates each having an integer voting Id using which students would vote them. Students are done with voting and all the votes are kept in an array. Now, Tina is given the task of declaring who won the election.

The rules are a bit different here, let's say total number of votes are
N
 and for a candidate to win she/he should have received more than
N
/
2
 votes. Tina has written the most efficient code for this. Can you also try and write efficient code for this problem?

Input
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
 space separated integers denoting votes.

Output
Print
T
 lines, each containing the voting Id of the winner. Print
−
1
 if no such winner exists.

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

1
<=
A
[
i
]
<
10
6

Time Limit
1 second

Example
Input
2
5
1 3 2 2 2
4
1 3 2 2

Output
2
-1

Sample test case explanation
In the first test case
1. Candidate with voting id =
1
 got one vote.
2. Candidate with voting id =
2
 got three votes.
3. Candidate with voting id =
3
 got one vote.

N
=
5
, so
N
/
2
=
2
, and candidate with voting id=
2
 got more than
N
/
2
 votes,
therefore the output is
2
.


 */
