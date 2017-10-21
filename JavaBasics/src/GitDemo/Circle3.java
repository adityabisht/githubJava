package GitDemo;

public class Circle3 {
	
	private double radius;
	private static int numberOfObjects=0;
	
	
	
	public Circle3()
	
	{
		
		numberOfObjects++;
	}
	
public Circle3(double newRadius)
	
	{
	
	radius = newRadius;
		
		numberOfObjects++;
	}
	
	public void setRadius(double newRadius)
	{
		radius =newRadius;
		
	}

	public double getRadius()
	{
		return radius;
		
	}
	
	public double area()
	{
		return radius*radius*Math.PI;
		
	}
    
	
	public static int getNumberOfObjects()
	{
		
		return numberOfObjects;
	}
	
	

}

