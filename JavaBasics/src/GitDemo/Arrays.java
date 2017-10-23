package GitDemo;

public class Arrays {
	
	public static void main(String args []){
		
		//int array1 [] = new int[5];
		int array1 [] = {2,4,1,5,2,5,5};
	
		//Print the array
		
		for(int i =0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" "+"");
		}
		
		System.out.println();
		
		// Find the largest Number
		
		int max = array1[0];
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]>max)
			{
				max=array1[i];
			}
			
		}
		System.out.print("The greatest integer is "+max);
		
		System.out.println();
		// Find the smallest Number
		
		int small = array1[0];
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]<small)
			{
				small=array1[i];
			}
			
		}
		System.out.print("The small integer is "+small);
		
		System.out.println();
		
		
	// Finding the smallest index of the largest number.
		
int max_new = array1[0];
int indexOfMax=0;
		
		for(int i =0;i<array1.length;i++)
		{
			if(array1[i]>max_new)
			{
				max_new=array1[i];
				indexOfMax =i;
			}
			
		}
		System.out.print("The smallest index of the largest number "+indexOfMax);
		
		System.out.println();
		// Shifting one element of the array to left and first element should come in the last.
		
		int temp = array1[0];
		
		
		for(int i =1;i<array1.length;i++)
		{
			array1[i-1]=array1[i];
			System.out.print(array1[i]+"\t");
		}
		
		array1[array1.length-1]= temp;
		System.out.println(temp);
		
		//System.out.println(array1);
	}//End of main method

	
	
	
	
	
	
	
}//End of class
