package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {

            String str = sc.next();
            int count;
            int longest = 0;

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < str.length(); j++) {

                map.clear();
                map.put(str.charAt(j), j);
                count = 1;

                for (int k = j + 1; k < str.length(); k++) {

                    if (map.containsKey(str.charAt(k))) {

                        break;
                    } else {
                        map.put(str.charAt(k), k);
                        count++;
                    }
                }
                if (count > longest) {
                    longest = count;
                }
                if (longest > (str.length() - j)) {
                    break;
                }
            }
            System.out.println(longest);

        }
    }
}

/* QUESTION :-

   Longest Unique
A problem statement without any story. Given a string
S
, find the length of the longest substring with all unique characters.

Input format
The first line contains an integer
T
 denoting the number of test cases.
Each test case consists of a string
S
.

Output format
For each test case on a new line print the required length.

Constraints:
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
5

Time Limit
1
 ​secon

Example
Input
2
prepbytes
codingplatform

Output
6
12

Sample test case explanation
In the first test case, the longest substring with unique characters is pbytes or repbyt both have length
=
6
.
In the second test case, the longest substring with unique characters is dingplatform with length
=
12
.



 */

