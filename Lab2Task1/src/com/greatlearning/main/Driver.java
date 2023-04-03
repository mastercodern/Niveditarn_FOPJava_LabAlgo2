package com.greatlearning.main;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, numTarget, target, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array ");
		size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		numTarget = sc.nextInt();
		for (int i = 0; i < numTarget; i++) {
			sum = 0;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			for (int j = 0; j < size; j++) {
				sum += array[j];
				if (sum > target) {
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					break;
				}
			}
			if (sum < target) {
				System.out.println("Given target is not achieved");
			}

		}

	}

}
