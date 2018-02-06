package InterviewProgramming;

public class FindPivotBinarySearch {

public static int	arraySortedRotatedFindElement(int [] arr, int key)
	{
		
		int pivot =	findPivotBinarySearch(arr);
		if(key>= arr[0] && key<=arr[pivot-1])
			
		{
			return BinarySearch(arr,0,pivot-1,key);
			
		}
		else{
			
			return BinarySearch(arr,pivot+1,arr.length-1,key);
		}
		
	}
	
	
	
	public static int findPivotBinarySearch(int [] arr)
	{
		//Check if array is sorted or not
		
		if(arr[0]<=arr[arr.length-1])
		{
			return 0;
		}
		
		int low=0;
		int high = arr.length-1;
	int mid;
		while (low<=high)
		{
			//Calculate mid
			
			
			 mid=(low+high)/2;
			
			if(arr[mid]>arr[mid+1])
			{
				return  mid+1;
				
			}
			
			else if(arr[low]<=arr[mid])
			{
				
				low=mid+1;
			}
			
			
			else {
				
				high=mid-1;
			}
		}
		return -1;		
		
		
	}
	
	
	public static int BinarySearch(int [] arr, int low, int high,int key)
	
	{
		
		while (low<=high)
		{
			int mid=(low+high)/2;
			
			if(key==arr[mid])
			{
				return mid;
			}
			
			else if (key<arr[mid])
			{
				high=mid-1;
			}
			
			else{
				
				low=mid+1;
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
		
int [] arr = new int []{7,8,9,1,2,3,4,5,6};
		
		
		printArray(arr);
		
		int key=8 ;
		int index = arraySortedRotatedFindElement(arr,key);
		if(index!=-1)
		{
			System.out.println("The element "+key+" is at index "+index);
		}
		
		else{
			
			System.out.println("The element "+key+" is not in the array");
		}
		
	}
	
	
	
	

}
