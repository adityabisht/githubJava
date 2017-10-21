package GitDemo;


public class Cirlce1{

	public double radius;
	static int numberOfObjects =0;
	
public Cirlce1(){
		
		radius =10.00;
		numberOfObjects++;
	}
	public Cirlce1(double givenRadius)
	{
		
		radius =givenRadius;
		numberOfObjects++;
	}
	
	public double area()
	{
		return radius*radius*Math.PI;
		
	}
	
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
}//End of circle1
