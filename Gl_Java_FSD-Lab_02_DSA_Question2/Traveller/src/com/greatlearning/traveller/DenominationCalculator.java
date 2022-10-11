package com.greatlearning.traveller;
import java.util.*;

public class DenominationCalculator {

	Scanner sc = new Scanner(System.in);
	private int tempAmount;
	int amountToBePaid;
	
	public void calculate(int[] denominations, int amountToBePaid) {
	
		System.out.println("Enter the amount to be paid: ");
		amountToBePaid = sc.nextInt();
		
		int len = denominations.length;
	
		tempAmount = amountToBePaid;
		
		int quotient = tempAmount / denominations[len-1];
		
		int remainder = tempAmount % denominations[len-1];
		
		for(int i=(len-1);i>0;i--) {
			
			do {
				if(quotient > 0) {
					System.out.println("Denomination value: "+denominations[i]+"  Denomination count: "+quotient);
				}
			}while(tempAmount==0);
			
			tempAmount = tempAmount - (quotient*denominations[i]);
			quotient = tempAmount / denominations[i-1];
			remainder = tempAmount % denominations[i-1];
		}
		if(remainder >= 0) {
			System.out.println("Denomination value: "+denominations[0]+"  Denomination count: "+quotient);	
		}
	}

	public static void main(String[] args) {
		
		TransactionSortingClass obj = new TransactionSortingClass();
		obj.implementation();
		
		DenominationCalculator obj2 = new DenominationCalculator();
		obj2.calculate(obj.denominations, obj2.amountToBePaid);
		
	}
}



