package GitDemo;

public class TestFan {

	
	public static void main(String args [])
	{
		
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);//This is how you pass on the Constant in java
		fan1.setColor("Yellow");
		fan1.setOn(true);
		fan1.setRadius(10);
		
		System.out.println(fan1);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setColor("Blue");
		fan2.setOn(false);
		fan2.setRadius(5);
		
		System.out.println(fan2);
		
		
		
	}
}
