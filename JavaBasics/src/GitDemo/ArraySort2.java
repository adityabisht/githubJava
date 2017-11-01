package GitDemo;

public class ArraySort2 {

	
	public static void main(String args [])
	
	{
		
		int [] arrayMerge = {2,4,1,6,8,5,3};
		MergeSort(arrayMerge);
		
	}//End of Main Method
	
	public static void MergeSort(int [] array)
	{
		
		int arrayLen = array.length;

		if(arrayLen <=1 )
		{
			return;
			
		}//End of IF
		
		int mid = array.length/2;
		
		int [] leftArray = new int[mid];
		int [] rightArray = new int[array.length-mid];
		
		/*Filling the values in rightArray
		 * */
		
		for(int i=0;i<mid;i++)
		{
			leftArray[i] = array[i];
			
		}
		
		MergeSort(leftArray);
		
		//printArray(leftArray);

		/*Filling the values in leftArray
		 * */
		
		for(int i=mid;i<array.length;i++)
		{
			rightArray[i-mid] = array[i];
			
		}
		
		//printArray(rightArray);
		
		
		MergeSort(rightArray);
		
		int [] result = Merge(leftArray,rightArray);
		printArray(result);
		
	}//End of MergeSort Method
	
	public static int [] Merge(int [] array1, int [] array2)
	{
		int [] temp = new int[array1.length+array2.length];
		
		int i=0;
		int j =0;
		int k =0;
		
		while(i<array1.length&& j<array2.length)
		{
			if(array1[i]<array2[i])
			{
				temp[k++]=array1[i++];
				
			}//End of I
			else
				
				temp[k++]=array2[j++];
			
		}//End of Matching While
			
			
		while(i<array1.length)
		{
			temp[k++]=array1[i++];
			
			
		}//End of 2nd While
		
		while(j<array2.length)
		{
			temp[k++]=array1[j++];
			
			
		}//End of 2nd While
		
		
		return temp;
		
	}//End of Merge
	
	public static void printArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}//End of for loop
		System.out.println();
	}//End of method
	
}//End of Class
