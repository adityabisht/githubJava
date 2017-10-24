package GitDemo;
import java.util.*;
public class Arrays {
	
	
	
	
	public static void main(String args []){
		
		//int array1 [] = new int[5];
		int array1 [] = {2,4,1,5,2,5,5};
	
		
		//Printing the Original Array
		printArray(array1);
		
		// Find the largest Number
		
		int max = array1[0];
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]>max)
			{
				max=array1[i];
			}
			
		}
		System.out.print("The greatest integer is "+max);
		
		System.out.println();
		// Find the smallest Number
		
		int small = array1[0];
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]<small)
			{
				small=array1[i];
			}
			
		}
		System.out.print("The small integer is "+small);
		
		System.out.println();
		
		
	// Finding the smallest index of the largest number.
		
int max_new = array1[0];
int indexOfMax=0;
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]>max_new)
			{
				max_new=array1[i];
				indexOfMax =i;
			}
			
		}
		System.out.print("The smallest index of the largest number "+indexOfMax);
		
		System.out.println();
		// Shifting one element of the array to left and first element should come in the last.
		
		/*
		int temp = array1[0];
		
		
		for(int i =1;i<array1.length;i++)
		{
			array1[i-1]=array1[i];
			System.out.print(array1[i]+"\t");
		}
		
		array1[array1.length-1]= temp;
		System.out.println(temp);
		
		*/
		
	//
		
		System.out.println("Reversing the array using an additonal Array");
		
		
		
		//Printing the Reverse of An Array With Using an Additional Array 
		printArray(reverseArrayWithAdditionalArray(array1));
		
		// Printing the Reverse of an Array With out using the an Additional Array.
		reverseArrayWithoutAdditionalArray(array1);
		
		
		//Method to shift the Array elements to LEFT by 1 position.
		System.out.println("Shifting the array elements by 1 ");
		shiftLeft(array1);
	}//End of main method

/*
 * Method to Reverse an Array with using an Additioanl Array
 * 	
 */
public static  int[] reverseArrayWithAdditionalArray(int array2[])
{
 int [] temp = new int[array2.length];
 
 for(int i=0;i<array2.length;i++)
 {
	 
	
	  temp[i]=array2[array2.length-i-1];
	  
 }
	
	return temp;
}


/*
 * Method to Reverse an Array Without using the Additional Array
 * 
 * 
 * */

public static void reverseArrayWithoutAdditionalArray(int array2[])
{
 int temp;
	for (int i=0;i<array2.length/2;i++)
	{
		
		temp=array2[i];
		array2[i]=array2[array2.length-i-1];
		array2[array2.length-i-1]=temp;
		
	}

System.out.println("Printing the reverse of an array without using an additioanl array");
	printArray(array2);
}


public static void shiftLeft(int array2[]){
//Shifting one element of the array to left and first element should come in the last.

	int temp = array2[0];

for(int i =1;i<array2.length;i++)
			{
				array2[i-1]=array2[i];
				System.out.print(array2[i]+"\t");
			}
			
			array2[array2.length-1]= temp;
			System.out.println(temp);
			
			
	
}


	
public static void printArray(int array3[])
{
	for(int i =0;i<array3.length;i++)
	{
		System.out.print(array3[i]+" "+"");
	}
	System.out.println();
}
	
	
	
}//End of class
