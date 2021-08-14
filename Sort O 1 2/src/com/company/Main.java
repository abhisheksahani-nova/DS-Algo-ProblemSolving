package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[]  = new int[]{2,0,1,2,0,1,2,2,0,1,0};
        int n = arr.length;
        sort012(arr,n);
    }

    public static void sort012(int arr[],int n){

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;


        for(int i=0 ; i< arr.length ; i++){

            if(arr[i] == 0){
                count0++;
            }else if (arr[i] == 1){
                count1++;
            }else if (arr[i] == 2){
                count2++;
            }
        }


        for (int i=0 ; i<count0 ; i++){

            arr[i] = 0;
        }

        for(int i=count0 ; i<(count0+count1) ; i++){
            arr[i] = 1;
        }

        for (int i=(count0+count1) ; i<n ; i++) {
            arr[i] = 2;
        }

        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
