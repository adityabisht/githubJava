/**
 * 
 */
package InterviewProgramming;

/**
 * @author Aditya
 *
 */
public class ArrayReverseAlgo {

	/**
	 * @param args
	 */
	
	public static void rotateOne(int [] arr, int n, int d)
	{
		
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}	
	
	
	public static void reverseArray(int [] arr, int start, int end)
	
	{
		
		while(start<end)
		{
			
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
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
		// TODO Auto-generated method stub

		
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		int n=arr.length;
		rotateOne(arr,n,4);
		printArray(arr);
	}

}
