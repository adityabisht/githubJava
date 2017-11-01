/*
123456
 12345
  1234
   123
    12
     1

 * 
 * 
 * 
 * */

package GitDemo;

public class numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nr =6;
		
		for(int i=nr;i>=1;i--)//1
        {
            for(int j=nr;j>i;j--)//2
            {
                System.out.print(" ");
               
            }//2
           
             for(int k=1;k<=i;k++)//3
            {
                System.out.print(k);
               
            }//3
            System.out.println();
        }//1
		
	}

}
