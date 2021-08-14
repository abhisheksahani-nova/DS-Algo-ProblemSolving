package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int k =0; k<T; k++){

            int N = sc.nextInt();
            String str[] = new String[N];
            HashMap<Character,Integer> map = new HashMap<>();
            int count =0;

            for (int i =0; i<N ;i++){

                str[i] = sc.next();
            }
            int freq[] = new int[26];

            for (int i=0 ; i<N ;i++){

                map.clear();

                for (int j=0 ; j < str[i].length() ; j++){

                    if (map.containsKey(str[i].charAt(j))){
                        continue;
                    }
                    else{
                        map.put(str[i].charAt(j),j);
                        freq[(int)str[i].charAt(j) - (int)'a']++ ;

                    }
                }
            }
            for(int i =0 ; i<26 ; i++){

                if (freq[i] == N){

                    count++ ;

                }
            }
            System.out.println(count);

        }
    }
}

/*  QUESTION :-

   Star Character
PrepBuddy has a collection of strings stored in an array. He wants to know the count of Star Characters present in the collection. A Star character is a character that occurs at least once in each of the string present inside the collection.

Input format
The first line contains an integer
T
 denoting the number of test cases.
For each test case:
The first line contains an integer
N
 denoting the number of strings present inside the collection.
Each of the next
N
 lines contains a string.

Output format
For each test case on a new line, print the count of Star characters.

Constraints:
1
<=
T
<=
10

1
<=
N
<=
100

1
<=
|
S
|
<=
100

Time Limit
1
 ​secon

Example
Input
3
3
abcdde
baccd
eeabg
4
basdfj
asdlkjfdjsa
bnafvfnsd
oafhdlasd
3
vtrjvgbj
mkmjyaeav
sibzdmsk

Output
2
4
0


 */