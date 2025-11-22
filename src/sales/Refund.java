package sales;

/**
 * this class is for the money being refunded to the customer
 * NB refund values are always stored as a negative number
 */

//so the refund class can inherit transaction because
//a refund is technically a type of transaction so it has access to value via the super class (inheritance)

public class Refund extends Transaction{
	
	private String reason;
	/**
	 * this method creates a new refund
	 * if a positive value is provided it it converted to a negative value because as stated above
	 * "refund values are always stored as a negative number"
	 * @param value the amount owed in pennies
	 * @param reason the reason the amount is owed
	 */
	
	public Refund(int value, String reason) {
		//because a refund has to be -ve i'll multiply the value by -1 then pass it to the transaction constructor when needed.
		super(value > 0 ? -value:value);
		//to store the reason for the refund
		this.reason = reason;
	}
	
	/**
	 * this returns a message for the reason for the refund
	 * @return
	 */
	
	public String getReason() {
		return reason;
	}

}
