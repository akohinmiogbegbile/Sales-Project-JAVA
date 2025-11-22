package sales;

//so the refund class can inherit transaction because
//a refund is technically a type of transaction so it has access to value via the super class (inheritance)

public class Refund extends Transaction{
	
	private String reason;
	
	public Refund(int value, String reason) {
		//because a refund has to be -ve i'll multiply the value by -1 then pass it to the transaction constructor when needed.
		super(value > 0 ? -value:value);
		//to store the reason for the refund
		this.reason = reason;
	}
	
	public String getReason() {
		return reason;
	}

}
