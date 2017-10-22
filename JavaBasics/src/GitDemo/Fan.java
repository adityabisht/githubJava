package GitDemo;

public class Fan {

	public static final int SLOW =1,MEDIUM=2,FAST=3;
	int speed;
	
	boolean on;
	
	double radius;
	
	String color;
   	
	public Fan()
	{
		
		this.speed = SLOW;
		this.on=false;
		this.radius=5;
		this.color="Blue";
	}
	
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int newSpeed)
	{
		speed= newSpeed;
		
	}
	
	public boolean getOn()
	{
		return on;
	}
	
	public void setOn(boolean newOn)
	{
		on = newOn;
		
	}
	
	
	public void  setRadius(double newRadius)
	{
	radius = newRadius;
		
	}

	public double getRadius()
	{
		return radius;
	}
	
	
	public String getColor()
	{
		
		return color;
	}
	
	public void setColor(String newColor)
	{
		color =newColor;
	}

	
	public String toString()
	{
		if(on==true)
		{
			return "The fan speed is "+getSpeed()+" and the color is "+getColor()+" with radius "+getRadius()+" .";
		
		}
		else{
			return "The color of the fan is "+getColor()+" with radius "+getRadius()+" and the fan is switched OFF";
		}
	}// end of toString method.
	
	
	
}

