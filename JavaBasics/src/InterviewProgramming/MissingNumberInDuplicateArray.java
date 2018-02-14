package InterviewProgramming;

import java.util.Scanner;

public class MissingNumberInDuplicateArray {

	/**
	 * XOR
	 * 
	 * A^A=0
	 * A^0=A
	 * */
	
	
	
	
	public static int checkArraysForValidation(int [] arrOrig, int [] arrDup, String methodName)
	{
		int missingElement;
		
		if(arrOrig.length==0 || arrDup.length ==0)
		{
			System.out.println("Invalid Array");
			System.exit(0);
		}
		
		
		if(methodName=="SUM")
		{
		
		if(arrOrig.length>arrDup.length)
		{
			missingElement=findMissingElemntUsingSum( arrOrig, arrDup);
			return missingElement;
		}
		else{
			
			missingElement=findMissingElemntUsingSum( arrDup,  arrOrig);
			return missingElement;
		}
		}
		
		else {
			
			if(arrOrig.length>arrDup.length)
			{
				missingElement=findMissingElemntUsingXOR( arrOrig, arrDup);
				return missingElement;
			}
			else{
				
				missingElement=findMissingElemntUsingXOR( arrDup,  arrOrig);
				return missingElement;
			}
			
			
		}
		
	}
	
	
	public static int findMissingElemntUsingSum(int [] arr1, int [] arr2)
	{
		
		int resultOrigArray= findArraySum(arr1);
		int resultDupArray= findArraySum(arr2);
		
		int missingElement = resultOrigArray-resultDupArray;
		
		return missingElement;
		
		
	}
	
	
	public static int findArraySum(int [] arr)
	{
		
		int i;
		int sum=0;
		for(i=0;i<arr.length;i++)
		{
			
			
			sum+=arr[i];
		}
		
		return sum;
	}
	
	
	public static int findMissingElemntUsingXOR(int [] arr1, int[] arr2)
	{
		int missing =arr1[0];
		int i;
		for(i=1;i<arr1.length;i++)
		{
			missing=missing^arr1[i];
			//System.out.println(missing);
			
		}
		
		for(i=0;i<arr2.length;i++)
		{
			missing=missing^arr2[i];
			//System.out.println(missing);
			
		}
		
		
		return missing;
	}
	
	public static void main(String[] args) {
		

		
		
		
		
		int [] arrOrig = new int[]{1,2,4};
		
		int [] arrDup = new int[]{2,1,3,4};

	
		
		
		Scanner scanner = new Scanner(System.in);
		String methodName;
		
		System.out.println("Enter The Preffered Method to Find The Missing Element : ");
		methodName=(scanner.nextLine());
		
		
		System.out.println("The Selected Method is "+methodName);
		System.out.println("The missing element is "+checkArraysForValidation(arrOrig,arrDup,methodName));
		
		
		
	}

}
