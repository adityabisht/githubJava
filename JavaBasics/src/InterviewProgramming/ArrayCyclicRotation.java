package InterviewProgramming;

public class ArrayCyclicRotation {
	
	public static void cyclicRotate(int [] arr,int n)
	
	{
		int temp=arr[n-1];
		int i;
		for( i=n-1;i>0;i--)
			
			
		{
			arr[i]=arr[i-1];
			
			//System.out.println(arr[i]);
		}
		
		
		arr[i]=temp;
		
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

		int [] arr = new int[] {1,2,3,4,5,7,8,9};
		int n=arr.length;
		cyclicRotate(arr,n);
		printArray(arr);
		
		
	}

}
