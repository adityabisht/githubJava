package InterviewProgramming;
/*
 * You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. 
 * One of the integers is missing in the list. Write an efficient code to find the missing integer.
 * */


public class FindMissingNumberInContinousArrayElements {

	
	public static int  findMissingElementUsingSum(int [] arr,int n)
	{
		
		int total=(n+1)*(n+2)/2;
		
		int i;
		
		for ( i=0;i<arr.length;i++)
		{
			total=total-arr[i];
			
		}
		
		return total;
	}
	
	public static int  findMissingElementUsingXOR(int [] arr,int n)
	{
		
		int total=(n+1)*(n+2)/2;
		
		int i;
		
		for ( i=0;i<arr.length;i++)
		{
			total=total-arr[i];
			
		}
		
		return total;
	}
	
	
	
	
	public static void  printArray(int [] arr)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" "+" ");
		}
		System.out.println();
		
	}	
	
	
	
	public static void main(String[] args) {
		
		
		int [] arr= new int[]{1,2,3,5,6};
		printArray(arr);
		System.out.println("The missing element is "+findMissingElementUsingSum(arr,arr.length));
		//findMissingElementUsingSum(arr,arr.length);
	}

}
