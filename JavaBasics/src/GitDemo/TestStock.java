package GitDemo;

public class TestStock {

	public static void main(String[] args) {


		Stock stock1 = new Stock("SUNW","Sun MicroSystems Inc");
		stock1.setCurrentPrice(90);
		stock1.setPreviosClosingPrice(100);
		
		
		System.out.println("The change in percent of share "+stock1.getname()+" with sysmbol "+stock1.getSymbol()+ " is "
				+ stock1.getChangePercent()+" %");

	}

}
