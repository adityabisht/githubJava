package GitDemo;
import java.util.*;

public class doWhile {
	
	public static void main(String [] args){
		
		int data;
		int sum=0;
		try(Scanner input = new Scanner(System.in)){
			
			do {
		System.out.print("Enter the number to add : ");
		data = input.nextInt();
			sum=sum+data;	
				
			} while(data!=0);	
			
		}//End of Try
		
		System.out.println("The Sum is : "+sum);
		
		
		
	}//End of Void Method
	
	

}//End of Main Class
