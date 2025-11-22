package sales;
/**
 * this saleable interface represents any item that can be sold
 * following the uml diagram both product and service use this interface
 */

public interface Saleable {
	
	/**
	 * to return the price of the saleable in pennies
	 * @return the price as an integer because doubles are unreliable for money
	 */
	int getPrice();

}
