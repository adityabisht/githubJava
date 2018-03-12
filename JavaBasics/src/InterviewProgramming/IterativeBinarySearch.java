package InterviewProgramming;

public class IterativeBinarySearch {

	public static int iterativeBinarySearch(int [] arr, int low, int high, int key)
	{
		
		
		
		
		if(low<=high)
			
			
		{
			int mid= (low+high)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key < arr[mid])
			{
				
				return iterativeBinarySearch(arr,low,mid-1,key);
			}
			
			else 
				
			{
				return iterativeBinarySearch(arr,mid+1,high,key);
				
			}
		}
		
		
		return -1;
		
		
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
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		int low=0;
		int high=n-1;
		int key =8;
		printArray(arr);
	int index =	iterativeBinarySearch(arr,low,high,key);
	System.out.println("The key is at index "+index);
		
	}

}
