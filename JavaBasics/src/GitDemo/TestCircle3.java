package GitDemo;

//Passing array of objects

public class TestCircle3 {

	public static void main(String[] args) {
			
//Initializing the an Array of Circle3		
//Here the value of each refernce variable is null
Circle3[] circleArray;
		
//Calling method createArray to initialize the objects of Array circleArray
		circleArray=createArray();

		//Calling the Method printCircleArray to print the radius and area of each circle.
	printCircleArray(circleArray);
		
	System.out.println("Number of Objects "+Circle3.getNumberOfObjects());
	
	}//End of Main Method

	
	
	public static Circle3[] createArray()
	
	{
		
		Circle3[] circleArray = new Circle3[5];
		
		for(int i=0;i<circleArray.length;i++)
		{
			circleArray[i] = new Circle3(Math.random()*100);
			
			
		}//End of For Loop
		
		return circleArray;
		}//End of createArray Method 
	
	
	public static void printCircleArray(Circle3[] circleArray)
	{
		
		System.out.println("Radius\t\t\t"+"Area");
		
		for(int i=0; i<circleArray.length;i++)
		{
			System.out.println(circleArray[i].getRadius() +"\t\t\t"+circleArray[i].area());
			
		}
		
		
	}//End of printCircleArray Method
	
}//End of TestCircle3 Class

