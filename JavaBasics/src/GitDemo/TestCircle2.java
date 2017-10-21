package GitDemo;

public class TestCircle2 {
	public static int a =9;
	
	public static void main(String args [])
	
	{
		
		
		System.out.println("Object 1");
		Circle2 circle2_1 =new Circle2(); 
		circle2_1.setRadius(2);
		System.out.println(circle2_1.getRadius());
		System.out.println(circle2_1.area());
		
		
		System.out.println("Object 2");
		
		Circle2 circle2_2 =new Circle2();
		System.out.println(circle2_2.getRadius());
		System.out.println(circle2_2.area());
		
		System.out.println("Tottal Number of Objects Created  "+Circle2.getNumberOfObjects());
		
		
		
		
	}

}
