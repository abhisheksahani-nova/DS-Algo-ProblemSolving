package com.company;

public class Main {

    public static void main(String[] args) {

        int nums[] = new int[]{2,5,9,6,9,3,8,9,7,1};
        int arr[] = new int[nums.length];
        int dup = 0;


        for(int i=0 ; i<nums.length ; i++){

            arr[nums[i]]++ ;

            if(arr[nums[i]] > 1){

                dup = nums[i];
                break;
            }
        }

        System.out.println(dup);

    }
}
