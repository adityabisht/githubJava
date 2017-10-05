package GitDemo;

public class floydtriangle {

	public static void main(String [] args) {
		
	int nr=4;
	int value =1;
	for(int i =1; i<=nr;i++)//1
	{
		for(int j=1;j<=i;j++)//2
		{
			System.out.print(value+" ");
			value++;
		}//2
		System.out.println();
	}//1
	 
	 
}//End of Main Method
}//end of class
