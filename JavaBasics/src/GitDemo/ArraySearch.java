/*Arrays Search
 * Linear Search not good for large arrays.
 * The algo compares half of the elements.
 * LINEAR SEARCH 
 * 
 * and
 * 
 * BINARY SEARCH 
 *  
 *  
 *  
 * 
 * 
 * */

package GitDemo;

public class ArraySearch {
	
	public static void main (String args [])
	
	{
		int [] arrayLin = {1,4,4,2,5,-3,6,2};
		
		int toLinFind= -6;
		
		
		
		int [] arrayBinary ={2,4,11,7,10,11,45,50,59,60,69,70,79};
		
		int toBinFind= 11;
	
	
	System.out.println(arrayLinearSearch(arrayLin,toLinFind));
		
	System.out.println(arrayBinarySearch(arrayBinary,toBinFind));
	
	
	
	}//End of Main Method 

	public static int arrayLinearSearch(int [] arr, int key)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(key==arr[i])
			{
				return i;
				
			}//End of If
			
		
			
		}//End of For Loop
		return -1;
		
	}//End of ArrayLinearSearch Method
	
	/*CONDITION : Array should be sorted.
	 * 
	 * 
	 * if the key is less than the middle element  continue to search for the key only in the first half of the array.
	 * 
	 * if the key is equal to middle element return the middle element
	 * 
	 * if the key is greater than the middle element you need to continue to search for the key only in the second half of the array
	 * 
	 * 
	 * */
	
	public static int arrayBinarySearch(int [] arr, int key)
	{
		
		int low=0;
		int high =arr.length-1;
		
		
		// This is >= is used in case the last iteration has just 1 element left. it will give the right answers even the 
		//elements are duplicate.
		
		while(high>=low)
		{
			int mid = (low+high)/2;
			
			if (key < arr[mid])
				high=mid-1;
			else if (key>arr[mid])
				low=mid+1;
			else
				return mid;
		}
		
		

	return -low-1;
	}//End of ArrayBinarySearch Method
	
	
	
	public static void printArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
		}//End of for loop
		
	}//End of method
	
	/* Method to reverse an array without an additional array*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//End of Main Class
