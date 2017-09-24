package GitDemo;

import java.util.Scanner;

public class SentinelLoop {

	public static void main (String [] args) {
		
		
		//Declare a sentinel value
		int sentinalValue = 0;
		int data;
		int sum = 0;
		
		try (Scanner input = new Scanner(System.in)){
			System.out.print("Enter the number to add : ");
		data = input.nextInt();
		
		while(data != sentinalValue){
		sum = sum+data;
			 
		System.out.print("Enter the number to add : ");
		data = input.nextInt();
		
		 
		
		}//End of While Group
		 System.out.println("The sum is : "+sum);
		}//End of try
	
	}//End of main 
}// End of Class
