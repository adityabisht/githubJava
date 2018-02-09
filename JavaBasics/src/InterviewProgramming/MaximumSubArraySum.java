package InterviewProgramming;

//Kadane's Algo

import java.lang.*;

public class MaximumSubArraySum {

	
	public static int findMaxSubarraySumIncludingAllNegativeElements(int [] arr)
	{
		int max_ending_here = arr[0];
		int max_so_far = arr[0];
		
		
		int i;
		
		for (i=1;i<arr.length;i++)
		{
			
			max_ending_here=Math.max(arr[i], arr[i]+max_ending_here);
			max_so_far=Math.max(max_so_far, max_ending_here);
			
		}
		
		return max_so_far;
		
	}
	
	public static int findMaxSubarraySum(int [] arr)
	{
		
		int max_ending_here =0;
		int max_so_far =0;
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			
			max_ending_here=max_ending_here+arr[i];
			
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			
			else if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
			}
			
		}
		
		return max_so_far;
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
		// TODO Auto-generated method stub

		int [] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
		printArray(arr);
		System.out.println("The max sum is "+findMaxSubarraySum(arr));
		System.out.println("The max sum is "+Math.max(-1,0));
		int [] arrneg = new int[]{-1,-2,-3,-4,-5};
		
		printArray(arrneg);
		System.out.println("The max sum is "+findMaxSubarraySumIncludingAllNegativeElements(arr));
		
		
	}

}
