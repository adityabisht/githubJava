package InterviewProgramming;

public class LeaderInAnArray {

	
	
	
	public static void findLeader(int [] arr)
	{
		
		int i ;
		int currentLeader = arr[arr.length-1];
		System.out.print(currentLeader+" ");
		for(i=arr.length-2;i>=0;i--) 
		{
			if(arr[i]>currentLeader)
			{
				
				currentLeader=arr[i];
				System.out.print(currentLeader+" ");
				
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
		
	
	
	int [] arr= new int[] {1999,2,300,-100,5,-6};
	printArray(arr);
	findLeader(arr);
	int n =arr.length;
}
}