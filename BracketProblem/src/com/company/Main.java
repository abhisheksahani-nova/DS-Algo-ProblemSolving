package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0 ; i<T ; i++){

            String str = sc.next();
            char ch ;
            int flag = 0;
            int openingcount = 0;
            int closingcount = 0;
            int freq[] = new int[2];

            if(str == null){
                System.out.println("Yes");
                break;
            }

            for(int j=0 ; j<str.length() ;j++){

                ch = str.charAt(j);

                freq[(int)ch - (int)'(']++ ;
            }

            if(freq[0] != freq[1]){

                System.out.println("No");
                flag = 1;

            }else{

                for(int k=0 ; k < str.length() ;k++){

                    if(str.charAt(k) == '('){

                        openingcount++;

                    }else{

                        closingcount++ ;
                    }

                    if((closingcount - openingcount) >= 2 ){

                        System.out.println("No");
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag != 1){

                System.out.println("Yes");
            }
        }

    }
}

/*   QUESTION :-

  Valid Strings
Arnab loves brackets and any valid sequence of brackets.
On his birthday, he expected a valid sequence of brackets from his friends.
He is upset because some of his friends deliberately gifted him an invalid sequence.
Now, Arnab decided to fix the sequence himself by moving only one of the brackets in the sequence.

A bracket sequence (S) is valid only if:
1. S is empty
2. S is equal to "(t)", where t is a valid sequence
3. S is equal to "(t1 t2)" ie. concatenation of t1 and t2, where t1 and t2 are valid sequences.

Arnab, being a lazy person wants you to check if the sequence can be made valid by moving just one bracket (if required).

Input format
First-line contains an integer
T
 where
T
 is the number of test cases.
The next
T
 lines contain a String
S
 denoting the sequence.

Output format
For each test case on a new line, print Yes or No depending on whether it is possible or not to convert the string into a valid string.

Constraints:
1
<=
T
<=
70

1
<=
|
S
|
<=
10
5
 ​, where
|
S
|
￼ denotes the length of the string

Time Limit
1
 ​secon

Example
Input
3
)(
(())
))((

Output
Yes
Yes
No

Sample test case explanation
we have the sequence )( so by moving the first bracket to the last we get () so it becomes a valid string.

 */