package com.company;

import java.util.Scanner;

        public class Main {

            public static void mergesort(int arr[], int l, int h) {

                if (l < h) {

                    int mid = l + (h - l) / 2;
                    mergesort(arr, l, mid);
                    mergesort(arr, mid + 1, h);
                    merge(arr, l, mid, h);

                }
            }

            public static void merge(int arr[], int l, int mid, int h) {

                int x[] = new int[h-l+1];
                int k = 0;
                int i = l;
                int j = mid + 1;

                while (i <= mid && j <= h) {

                    if (arr[i] < arr[j]) {

                        x[k++] = arr[i++];
                    } else {
                        x[k++] = arr[j++];
                    }
                }

                while (i <= mid) {

                    x[k++] = arr[i++];
                }

                while (j <= h) {

                    x[k++] = arr[j++];
                }

                int z=0;
                for (int r = l; r <= h; r++) {

                    arr[r] = x[z++];
                }


            }


            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int t =sc.nextInt();

                for (int j=0 ; j<t ; j++) {

                    int n = sc.nextInt();
                    int arr[] = new int[n];

                    for (int i = 0; i < n; i++) {

                        arr[i] = sc.nextInt();
                    }

                    mergesort(arr, 0, n - 1);

                    for (int i = 0; i < n; i++) {

                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                }
            }
        }

