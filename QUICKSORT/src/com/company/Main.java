package com.company;

import java.util.Scanner;

public class Main {

    public static void quicksort(int arr[],int low,int high){

        if(low >= high)
            return;

        int pivot = partition(arr,low,high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);

    }

    public static int partition(int arr[],int low,int high){

        int pivot = arr[high];
        int i = low-1;
        int temp;

        for(int j=low ;j<=high-1 ;j++){

            if(arr[j] <= arr[high]){

                i++;
                temp=arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0 ; i<t ; i++){

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int j=0 ; j<n ; j++){

                arr[j] = sc.nextInt();
            }

            quicksort(arr,0,n-1);

            for(int j=0 ; j<n ; j++){

                System.out.print(arr[j]+" ");
            }
        }

    }
}
