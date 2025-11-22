package sales;

import java.util.ArrayList;

public class Customer {
	
	//encapsulation is used here because the list stores transactions but can also contain
	//refunds and purchases because they are subtypes of transactions
	private ArrayList<Transaction> transactions;
	
	public Customer() {
		this.transactions = new ArrayList<>();
	}
	
	//used void because when the method passes a purchase or refund into transact it is added into
	//the customers transaction history so there is no need for the method to return anything 
	public void transact(Transaction t) {
		transactions.add(t);
	}
	
	public int getTotal() {
		int total = 0;
		for (Transaction t: transactions) {
			total += t.getValue();
		}
		return total;
	}
	public ArrayList<Transaction>getTransactions() {
		return transactions;
	}
}
