package sales;

import java.util.ArrayList;

public class Customer {
	
	private ArrayList<Transaction> transactions;
	
	public Customer() {
		this.transactions = new ArrayList<>();
	}
	
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
