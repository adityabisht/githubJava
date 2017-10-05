package GitDemo;
/*
 *       1
         2 1 2
        3 2 1 2 3
       4 3 2 1 2 3 4
      5 4 3 2 1 2 3 4 5
     6 5 4 3 2 1 2 3 4 5 6
    7 6 5 4 3 2 1 2 3 4 5 6 7
   8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
  9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
10 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 910
 * 
 * */


public class numnberpyramid {

	public static void main(String [] args) {
		
		int nr=10;
		
		for(int  i=1;i<=nr;i++)//1
			
		{
			
			for(int j = (nr-i);j>=1;j--)//2
			{
				
				System.out.print(" ");
				
			}//2
			

			for(int k = i ;k>=1;k--)//3
			{
				
				System.out.print((k>=10)?""+k:" "+k);
				
			}//3
			
			for(int l = 2 ;l<=i;l++)//3
			{
				
				System.out.print((l>=10)?""+l:" "+l);
				
			}//3
			System.out.println();
			
		}//1
		
	}
	
}
