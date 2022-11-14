package com.greatlearning.dsa.gradedproject.question1;

import java.util.*;

// Building a skyscraper
public class Skyscraper {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building : ");

		// Define num to store no. of days or no. of floors
		int num = sc.nextInt();
		
		// Using priorityQueue implementation to achieve Skyscraper
		Queue<Integer> pQueue = new PriorityQueue<Integer>(num, Collections.reverseOrder());

		// Define arr[] to store floor size on each day
		int arr[] = new int[num + 1];

		// traversal of arr[] and assigning its elements to floorSize
		for (int i = 1; i < num + 1; i++) {
			System.out.println("enter the floor size given on day : " + i);
			int floorSize = sc.nextInt();
			arr[i] = floorSize;
		}
		sc.close();

		// Define day to store largest size for each day
		int day = num;
		
		// Printing the construction order for each day
		System.out.println("\nThe order of construction is as follows : \n");

		// Define j to loop floor size and days
		int j = 1;

		// Define k to check if array of k equals day
		int k = 1;

		// condition to be executed till floor size reaches max no. of days or floors
		while (j <= num) {
			System.out.println("Day: " + j);
			// to check if array of k equals day, then add to pQueue and increment k
			if (arr[k] == day) {
				pQueue.add(arr[k]);
				k++;
				/*
				 * condition to be executed if pQueue is not empty and first element of pQueue
				 * is greater than or equals day
				 */
				while (!pQueue.isEmpty() && pQueue.peek() >= day) {
					// removing from pQueue and printing if condition is met
					System.out.print(pQueue.remove() + " ");
					day--;
				}
			}

			else {
				// if array of k not equals day, add to pQueue and increment k
				pQueue.add(arr[k]);
				k++;
			}

			System.out.println();
			j++;
		}

	}

}
