package com.greatlearning.traveller;
import java.util.*;

public class TransactionSortingClass {

	Scanner sc = new Scanner(System.in);
	public int[] denominations;
	int size, startPoint=0, min, i;
	boolean status=false;
	
	public void implementation() {
		
		insertValues();
		
		do {
			sortValues();
			status = checkStatus();
			
		} while(status==false);
		
	}
	
	public void insertValues() {
		
		System.out.println("Enter the number of denominations: ");
		size = sc.nextInt();
		
		int[] denominations = new int[size];
		
		System.out.println("Enter the denominations:-");
		for(int i=0;i<size;i++) {
			denominations[i] = sc.nextInt();
		}
		
		this.denominations = denominations;
		
	}
	
	public void sortValues() {
		
		if(startPoint<denominations.length-1) {
			if(denominations[startPoint]<denominations[startPoint+1]) {
				min = startPoint;
			}
			else {
				min=startPoint+1;
			}
			for(i=startPoint+1;i<denominations.length;i++) {
				if(denominations[min]>denominations[i]) {
					min=i;
				}
			}
			int temp = denominations[startPoint];
			denominations[startPoint] = denominations[min];
			denominations[min] = temp;
			
			startPoint +=1;
			
		}
	}
	
	public void printValues() {
		for(int X: denominations) {
			System.out.println(X+" ");
		}
	}

	public boolean checkStatus() {
		for(int i=0;i<size-1;i++) {
			if(denominations[i]>denominations[i+1]) {
				status = false;
				return status;
			}
		}
		return true;
	}
}



