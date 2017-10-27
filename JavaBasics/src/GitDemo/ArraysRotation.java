package GitDemo;

public class ArraysRotation {

	public static void main(String[] args) {
		
		
		int [] array1 = {1,2,3,4,5,6};
		
		//printArray(array1);
		
		shiftLeftDesiredPositions(array1,2);
		
		

	}//End of Main Method 


	public static void shiftLeftDesiredPositions(int array2[],int n){
		//Shifting one element of the array to left and first element should come in the last.
for(int j=0;j<n;j++){
				int temp = array2[0];
		for(int i =1;i<array2.length;i++)
					{
						array2[i-1]=array2[i];
						System.out.print(array2[i]+"\t");
					}
				
					array2[array2.length-1]= temp;
					System.out.println(temp);
			}
}                                                                                                                                                                                                                                                	
	
	
public static void printArray(int array3[])
{
	for(int i =0;i<array3.length;i++)
	{
		System.out.print(array3[i]+" "+"");
	}
	System.out.println();
}
	
	
}//End of Class
