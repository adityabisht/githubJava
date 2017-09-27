package GitDemo;

import java.util.*;

public class gcd {
public static void main(String [] args){
	
	/*int a= 125;
int b= 2525;*/

try (Scanner input = new Scanner(System.in)){
	
System.out.print("Enter the first digit : ");	
int a = input.nextInt();

System.out.print("Enter the second digit : ");	
int b = input.nextInt();

int gcd=1;
for(int i = 2;i<a && i<b;i++){
	
	if(a%i==0 && b%i==0){
		
		gcd = i;
	}//End of If
	
}//End of for loop

System.out.println("GCD is : "+gcd);

}//End of Try
	
}//End of Main Method
}//End of Class
