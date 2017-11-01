package GitDemo;

public class ArraysSortPractice {
public static void main(String args [])
{
	int [] arrSelectionSort ={3,1,5,-2,9,6};
	System.out.println("Selection Sort");
	sortSelection(arrSelectionSort);
	
	int [] arrBubbleSort ={3,1,5,-2,9,6};

	System.out.println("Bubble Sort");
	sortBubbble(arrBubbleSort);
	
	
	System.out.println("Insertion Sort");
	int [] arrInsertionSort ={3,1,5,-2,9,6};
	sortInsertion(arrInsertionSort);
}//End of Main Method 


public static void sortSelection(int [] array)

{
	
	
for(int i =0;i<array.length;i++)
{
	int min = array[i];
    int minIndex=i;
    int temp;
	
	for (int j =i;j<array.length;j++)
	{
		if(min > array[j])
		{
			min = array[j];
			
			minIndex =j;
		}//End of IF 
		
		
	
}//End of J For Loop
	if(array[i]> min)
	{
		
		temp = array[i];
		array[i]=array[minIndex];
		array[minIndex] = temp;
		
	}//End of If
}//End if I For Loop
printArray(array);
}//End of sortSelection Method


public static void sortBubbble(int [] array)
{
	
for (int i=0;i<array.length;i++)
{
	int temp;
	
	for (int j=0;j<array.length-1-i;j++)
	{
		if (array[j] > array [j+1])
		{
			
			temp = array[j];
			array[j]=array[j+1];
			array[j+1] = temp;
		}//End of IF 
		
	}//End of J For Loop
 	
}//End of  I For Loop

printArray(array);
}//End of Method 

/*All elements to the left of the Key Value shall be small.
 * 
 * */

public static void sortInsertion(int [] array)
{
int temp;
for (int i=0;i<array.length;i++)
{
int key = array[i];
int j= i-1;

while(j>=0 && key < array[j])
{
	temp = array[j];
	array[j]=array[j+1];
	array[j+1] = temp;
	j--;

}//End of While 
	

}//End of I FOR Loop
	
	
	printArray(array);	
}//

/*
 * 
 * int [] arrInsertionSort ={3,1,5,-2,9,6};
 * */
	
public static void printArray(int [] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		
	}//End of for loop
	System.out.println();
}//End of method

}//End of Class
