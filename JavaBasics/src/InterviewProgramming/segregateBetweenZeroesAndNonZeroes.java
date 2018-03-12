package InterviewProgramming;

/*Separating digits (0s, +ves, -ves) with an extra space.
 * */

public class segregateBetweenZeroesAndNonZeroes {

	
	public static void  putZeroesonRightSide(int [] arr)
	
	{
		
		int j=0;
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			}
			
		}
	
		
	}

	
public static void  putZeroesOnLeftSide(int [] arr)
	
	{
		
		int j=0;
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			}
			
		}
	
		
	}
	
	
public static void  separateNegativeAndPositiveIntegers(int [] arr)
	
	{
		
		int j=0;
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < 0)
			{
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			}
			
		}
	
		
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
		
		
		int [] arr = {9,0,3,-1,0,12,0,0,321,11,-921,0};

		
		System.out.println("Putting all Zeroes on Right Hand Side");
		
		printArray(arr);
		putZeroesonRightSide(arr);
		printArray(arr);
		
		
System.out.println("Putting all Zeroes on LeftHand Side");
		
int [] arr2 = {3,4,0,1,0,6,0,1,0,0};
		printArray(arr2);
		putZeroesOnLeftSide(arr2);
		printArray(arr2);
		
		
		System.out.println("Separating negatives and positve.");
		
		int [] arr1 = {9,-19,3,-1,45,12,-81,62,321,11,-921,-46};
		printArray(arr1);
		separateNegativeAndPositiveIntegers(arr1);
		printArray(arr1);
		
	}

}
