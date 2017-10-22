package GitDemo;

public class Stock {

	String symbol;
	String name;
	
	double previosClosingPrice; //Stores the stock price for the previous day.
	double currentPrice; //Stock price for the current time
						
	public Stock(String newSymbol, String newName )
	{
		
		symbol=newSymbol;
		name=newName;
	}//Constructor
	
	public String getSymbol()
	{
		return symbol;
	}//Accessor for Symbol
	
	public String getname()
	{
		return name;
	}//Accessor for Name
	
	public double getPreviosClosingPrice()
	{
		return previosClosingPrice;
	}//Accessor for getPreviosClosingPrice
	
	
	public double getCurrentPrice()
	{
		return  currentPrice;
	}//Accessor for currentPrice
	
	
	
	public void setCurrentPrice(double newCurrentPrice)
	{
		  currentPrice= newCurrentPrice;
	}//Mutator for currentPrice
	
	
	public void setPreviosClosingPrice(double newPreviosClosingPrice)
	{
		previosClosingPrice= newPreviosClosingPrice;
	}//Mutator for currentPrice
	
	
	public double getChangePercent()
	{
		return (currentPrice-previosClosingPrice )/(previosClosingPrice) * 100;
		
	}
	
}
