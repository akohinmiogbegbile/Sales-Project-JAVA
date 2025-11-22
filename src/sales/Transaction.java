package sales;
/**
 * based on the uml diagram, the transaction class is the parent class for purchases and refunds
 * each transaction stores a value in pennies
 */

public class Transaction {
	
	//this will allow subclasses like purchase and refund to access transactions
	//would not be possible with a private method
	protected int value;
	/**
	 * creates a new transaction
	 * @param value where the value of the transaction is in pennies
	 */
	
	public Transaction(int value) {
		this.value = value;
	}
	/**
	 * returns the value of the transaction
	 * @return the value returned in pennies
	 */
	
	public int getValue() {
		return value;
	}

}
