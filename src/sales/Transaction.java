package sales;

public class Transaction {
	
	//this will allow subclasses like purchase and refund to access transactions
	//would not be possible with a private method
	protected int value;
	
	public Transaction(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
