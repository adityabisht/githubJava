package GitDemo;

import java.util.*;

public class guessNumber {

	public static void main (String [] args) {
		//Generate A Random Number	
	int magicNumber = (int)(Math.random()*100);


int numberofAttempts = 5;
int refNum = 5;
int counter = 0;

while(counter < numberofAttempts){

//Ask user to enter the guessed number
Scanner input = new Scanner(System.in);
System.out.println("Enter a number to guess the magical numnber : ");

int guessNum = input.nextInt();
System.out.println("You entered : "+guessNum);


//Matching the Conditions
if(guessNum == magicNumber ){
	System.out.println("Yes your number is same as magic numner "+magicNumber);
}//End of IF

else if (guessNum > magicNumber){
	System.out.println("Your guess is too high");
	
}//End of Else If


else{
	System.out.println("Your guess is too low");
	
}//End of Else

refNum--;
System.out.println("Number of Attempts Remaining "+refNum);

counter++;
}//End of While
System.out.println("Magic Number is : "+magicNumber);
}//End of Void Main
}// End of Class
