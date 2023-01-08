package com.greatlearning.lab2;

import java.util.*;

public class currencydenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		Integer arr[] = new Integer[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		/*
		 * for(int j =size-1 ;j>0;j--) { for(int k =1;k<=j;k++) { if(arr[k]>arr[k-1]) {
		 * int temp = arr[k]; arr[k]= arr[k-1]; arr[k-1]=temp; } }
		 */

		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int k = 0; k < size; k++) {
			int a = amount / arr[k];
			int b = amount % arr[k];

			if (a != 0) {
				System.out.println(arr[k] + ":" + a);
			}
			amount = b;
		}
	}
}
