package com.greatlearning.main;

import java.util.Scanner;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int size, targetAmount, sum = 0, minNotes;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		int[] curArray = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			curArray[i] = sc.nextInt();
		}
		Arrays.sort(curArray); //Sorting the array
		System.out.println("Enter the amount you want to pay");
		targetAmount = sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");
		// Calling Array in descending order with for loop
		for (int i = size - 1; i >= 0; i--) {
			minNotes = 0;
			while ((sum + curArray[i]) <= targetAmount) {
				sum += curArray[i];
				minNotes += 1;
			}
			if (minNotes != 0) {
				System.out.println(curArray[i] + " : " + minNotes);

			}
			targetAmount = targetAmount - sum;
			if (targetAmount != 0) {
				sum = 0;
				minNotes = 0;
			} else
				break;

		}

	}

}
