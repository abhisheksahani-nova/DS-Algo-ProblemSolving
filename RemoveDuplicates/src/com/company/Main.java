package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "cosmos";
        StringBuilder sb = new StringBuilder(str);
        HashMap<Character,Integer> map = new HashMap<>();
        int delete = 0;

        for (int i = 0 ; i < sb.length();i++){

            if (map.containsKey(sb.charAt(i))){
                sb = sb.deleteCharAt(i);
                i--;

            }else{
                map.put(sb.charAt(i),i);
            }
        }

        System.out.println(sb);
    }
}

/*
   QUESTION :- Remove Duplicates from the String .


 */