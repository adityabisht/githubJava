package GitDemo;


public class Testcircle1 {

	public static void main(String args []){
		
		Cirlce1 circle1_1 = new Cirlce1();
		System.out.println(circle1_1.numberOfObjects);

		Cirlce1 circle1_2 = new Cirlce1(3.00);
		
		
		System.out.println(circle1_1.area());
		System.out.println(circle1_2.area());
		
		System.out.println(circle1_1.numberOfObjects);
		System.out.println(circle1_2.numberOfObjects);
		
		System.out.println(Cirlce1.getNumberOfObjects());
		
	}//End of main method 
	
}//End of Class TestCircle 1 
	

