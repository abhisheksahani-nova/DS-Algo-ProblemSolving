package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int M = sc.nextInt();
        char s[] = new char[str.length()];


        for(int i=0 ;i< str.length() ;i++){

            s[i] = str.charAt(i);
        }


        for(int i=0; i<M ;i++){

            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

            int range = r-l+1;

            if(k >= range){
                k = k % range ;
            }
            for(int j=0 ; j<k ;j++){

                char temp = s[r-1];

                for(int b =r-1 ; b>=l ;b--){

                    s[b] = s[b-1];
                }
                s[l-1] = temp ;
            }
        }
        System.out.println(String.valueOf(s));


    }
}

/*  QUESTION :-

  String Rotation
You have already solved a problem on rotation in the array section. PrepBuddy gives one more question on rotation. You have given a string
S
 and an integer
M
 (
M
 is called a query). Each query will contains indices
l
,
r
 (
1
-based indexing) and integer
k
. It means that you have to rotate the substring
S
[
l
.
.
.
r
]
,
k
 times. So you have to rotate the string for
M
 queries one by one in the order they are given.
The rotation means moving the last character to the position of the first character and shifting all other characters one position to the right.

For example: if the string
S
=
b
c
b
d
b
c
b
 and
m
=
2
 and the query is
l
1
=
3
,
r
1
=
6
,
k
1
=
1
 then the answer is bccbdbb. If after that we would process the query
l
2
=
1
,
r
2
=
4
,
k
2
=
2
 then we would get the string cbbcdbb.

Input Format
The first line of the input contains the string
S
. It contains only lowercase English alphabets.
The second line contains a single integer
M
. — the number of queries.
the next
M
 lines contain three integers
l
,
r
 and
k
.

Output Format
Print the resulting string
S
 after processing all
M
 queries.

Constraints
1
≤
|
S
|
≤
10
4

1
≤
M
≤
300

1
≤
l
≤
r
≤
10
4

1
≤
k
≤
10
6

Time limit
2 seconds

Input
bcbdbcb
2
3 6 1
1 4 2

Output
cbbcdbb

  

 */