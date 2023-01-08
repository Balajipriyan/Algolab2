package com.greatlearning.lab2;

import java.util.*;

public class transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int value = sc.nextInt();
		if (value <= 0) {
			System.out.println("Invalid Input");
		}
		while (value-- > 0) {
			int checker = 0;

			System.out.println("enter the value of target");
			int target = sc.nextInt();
			if (target < 0) {
				System.out.println("Invalid Input");
				break;
			}
			int sumvalue = 0;
			for (int k = 0; k < size; k++) {
				sumvalue = sumvalue + arr[k];
				if (sumvalue >= target) {
					System.out.println("Target achieved after " + (k + 1) + " Transactions");
					checker = 1;
					break;
				}
			}
			if (checker == 0) {
				System.out.println("Given Target is not acheived");
			}
		}
	}

}
