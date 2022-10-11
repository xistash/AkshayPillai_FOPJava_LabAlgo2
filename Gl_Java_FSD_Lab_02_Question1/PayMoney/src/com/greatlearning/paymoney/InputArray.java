package com.greatlearning.paymoney;
import java.util.*;

public class InputArray {
	public static void main(String[] args) {
		System.out.println("Enter the size of the transaction array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the value of the array");
		
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
			}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int target = sc.nextInt();	
		targetDeterminator td = new targetDeterminator(array, target);
		td.determine();
		sc.close();
		
	}

}
