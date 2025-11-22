package sales;
/**
 * this class represents a non physical service with a set price 
 */

public class Service implements Saleable {
	
	private int price;
	
	/**
	 * this creates a new service
	 * @param price is the price of the new service that was just created in pennies
	 */
	
	public Service (int price) {
		this.price = price;
	}
	
	/**
	 * returns how much the service costs
	 * @return the price in pennies
	 */
	@Override //to allow the getPrice method which was taken from the Saleable interface
	public int getPrice() {
		return price;
	}

}
