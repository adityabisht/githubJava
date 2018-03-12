package InterviewProgramming;

/*
 * Merge two sorted arrays
1.3
Given two sorted arrays, the task is to merge them in a sorted manner.

Examples:

Input :  arr1[] = { 1, 3, 4, 5}  
         arr2[] = {2, 4, 6, 8}
Output : arr3[] = {1, 2, 3, 4, 5, 6, 7, 8}

Input  : arr1[] = { 5, 8, 9}  
         arr2[] = {4, 7, 8} 
Output : arr3[] = {4, 5, 7, 8, 8, 9}
 * 
 * 
 * 
 * 
 * */


/*Prerequiste : Both Arrays have to be of same size */


public class mergeTwoEqualSortedArrays {
	
	
	public static int [] mergeTwoArrays(int [] arr1, int [] arr2)
	{
		
		int [] temp = new int[arr1.length+arr2.length];
	
		
		int arr1Pointer =0;
		int arr2Pointer =0;
		int tempPointer =0;
		
		while(arr1Pointer<arr1.length && arr2Pointer<arr2.length)
		{
			
			
			if(arr1[arr1Pointer]<arr2[arr2Pointer])
			{
				temp[tempPointer] = arr1[arr1Pointer];
				tempPointer++;
				arr1Pointer++;
			}
			
			else {
				
				temp[tempPointer] = arr2[arr2Pointer];
				tempPointer++;
				arr2Pointer++;
			}
			
		}//while
			
			
		while (arr1Pointer < arr1.length)
		{
			temp[tempPointer] = arr2[arr1Pointer];
			tempPointer++;
			arr1Pointer++;
			
		}
		
			
			
			while (arr2Pointer < arr2.length)
			{
				temp[tempPointer] = arr2[arr2Pointer];
				tempPointer++;
				arr2Pointer++;
				
			}
			

		
		return temp;
		
		
	}
	
	public static void  printArray(int [] arr)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" "+" ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String args [])
	{
		int[] arr1= {5,8,9};
		int[] arr2= {4,7,8};
		System.out.println("First Array :");
		printArray(arr1);
		
		
		
		System.out.println("First Array :");
		printArray(arr2);
		
		
		
		System.out.println("Merged Array :");
		
		
		
		printArray(mergeTwoArrays(arr1,arr2));
	}

}
