package GitDemo;

public class ArraySort2 {
	public static int [] MergeSort(int [] array)
	{
		
		int arrayLen = array.length;

		if(arrayLen <=1 )
		{
			return array;
			
		}//End of IF
		
		int mid = array.length/2;
		
		int [] leftArray = new int[mid];
		int [] rightArray = new int[array.length-mid];
		
		/*Filling the values in rightArray
		 * */
		
		for(int i=0;i<leftArray.length;i++)
		{
			leftArray[i] = array[i];
			
		}
		
	
		
	

		/*Filling the values in leftArray
		 * */
		
		for(int i=0;i<rightArray.length;i++)
		{
			rightArray[i] = array[i+array.length/2];
			
		}
		
		//printArray(rightArray);
		
		
		return Merge(MergeSort(leftArray),MergeSort(rightArray));
		
		
		
	}//End of MergeSort Method
	
	
	public static int [] Merge(int [] array1, int [] array2)
	{
		int [] temp = new int[array1.length+array2.length];
		
		int i=0;
		int j =0;
		int k=0;
		
		
		while(i<array1.length&& j<array2.length)
		{
			if(array1[i]<array2[j])
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
			temp[k++]=array2[j++];
			
			
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
	
	public static void main(String args [])
	
	{
		
		int [] arrayMerge = {2,4,-11,6,8,-5,3,9,11,-10,3};
	
	
	int [] result = MergeSort(arrayMerge);
	
	printArray(result);
		
	}//End of Main Method
	
	
}//End of Class