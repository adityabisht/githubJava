package GitDemo;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (int i= 1; i<10;i++){
	
	System.out.print(" "+i+" ");
	
}//End of for loop for printing 1-9
System.out.println();
System.out.println("------------------------------------------- ");
		
String output = "";
for (int j= 1; j<10;j++){
	output += j+" | ";	
for(int k= 1; k<10;k++){
	
	
if(j*k < 10){
	output += "  "+(j*k);
	
}//End of IF
else{
	output += " "+(j*k);
	
}//End of else
}//End of k Loop
output += "\n";
}//End of J Loop
	
	System.out.println(output);
}//End of main method

}//End of class
