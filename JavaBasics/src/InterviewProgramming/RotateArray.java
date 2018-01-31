/**
 * Write a Function to Rotate (arr[],d,n) that rotates arr[] of size n by d elements.
 * 
 * 1,2,3,4,5,6,7 
 * should become 
 * 
 * 3,4,5,6,7,1,2
 * 
 * if rotated by 2 elements
 * 
  */
package InterviewProgramming;

/**
 * @author Aditya
 *
 */
public class RotateArray {
	
	
	/*Function to Rotate the Array by D elements
	 * 
	 * arr = Array  to be rotated
	 * n=Size of the array
	 * d= number of elements by which array to be rotated.
	 **/
	
	public static void  rotateLeft(int [] arr, int n, int d)
	{
		
		for(int i=0;i<d;i++)
		{
			rotateByOne(arr,n);
			
		}
		
	}
	
	
	/*
	 * 
	 * */
	
	public static void  rotateByOne(int [] arr, int n)
	{
		
		int temp=arr[0];
		int i;
		for (  i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
			
			
		}
	
		arr[i]=temp;
		
	}
	
	
	/*
	 * Function to Print the Array
	 * */

	public static void  printArray(int [] arr)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" "+" ");
		}
		System.out.println();
		
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		int [] arr= new int[] {1,2,3,4,5,6,7};
		int n =arr.length;
		rotateLeft(arr,n,2);
		printArray(arr);
		
				
		

	}

}
