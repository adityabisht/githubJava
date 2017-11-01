package GitDemo;

public class ArraysSort {

	public static void main(String[] args) {
		

int[] selectionSort ={2,9,5,4,8,1,6};

int [] insertionSort ={5,8,1,3,9,6};

int [] bubbleSort ={5,8,1,3,9,6,-1};

System.out.println("Printing Actual Array");


System.out.println("Printing using SELECTION SORT");
sortSelection(selectionSort);	


System.out.println("Printing using INSERTION SORT");	
sortInsert(insertionSort);	


System.out.println("Printing using BUBBLE SORT");	
sortBubble(bubbleSort);	


	}//End of Main Method

	
	/*Java implementation of Selection Sort*/
	
	
	public static void sortSelection(int [] array)
	{
		
	for (int i =0;i<array.length;i++)
	{
		int min =array[i];
		int minIndex=i;
		int temp;
		
		for(int j=i;j<array.length;j++)
		{
			//This loop finds the minimum value and its index   value
			if(array[j]<min)
				
			{
				min=array[j];
			    minIndex=j;
			}//End of IF
}//End of J loop
		//Code to Check if the  min is smaller than the array[i] element. If it is then just swap
		// The reason why I am not doing array[i] =min is because min is a value .I want the position at what the min value is present in the array.
		if(array[i]>min)
		{
			temp=array[i];
			array[i]=array[minIndex];
			array[minIndex]=temp;
}
}//End of I loop
printArray(array);
}//End of sortSelection Method

	
public static void sortInsert(int [] array)
{
	
for(int i=1;i<array.length;i++)
{
	int key = array[i];
	int temp;
	
	int j = i-1;
			
	while(j>=0 && key <array[j] )
	{
		temp=array[j];
		array[j]=array[j+1];
		array[j+1]=temp;
		
		j--;
	}//End of While
	
}//End of I For Loop
printArray(array);
}//End of sortInsert
/*
 * Bubble Sort compares each left element with its right element and pushes the swaps the bigger element to the right side.
 * Thus creating a Bubble of bigger elements on the right hand side.
 * */
public static void sortBubble(int [] array)
{
	int temp;
	
	for(int i=0;i<array.length;i++)
	{
		for (int j=0;j<array.length-i-1;j++)
		{ 
			
			
			if(array[j]> array[j+1])
			{
				
				
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
			}//End of IF 
			
		}//End of J For Loop
		
		
	}//End of I For Loop
	printArray(array);
}//End of sortBubble Method





	
	
	
	
	public static void printArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}//End of for loop
		System.out.println();
	}//End of method
	
}//End of Class
