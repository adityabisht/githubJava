package GitDemo;

public class Circle2 {
	
	private double radius;
	private static int numberOfObjects=0;
	
	
	
	public Circle2()
	
	{
		
		numberOfObjects++;
	}
	
public Circle2(double newRadius)
	
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


