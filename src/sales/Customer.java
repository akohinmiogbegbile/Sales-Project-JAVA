package sales;
import java.util.ArrayList;

/**
 * this class stores a list of transactions and calculates the total
 */

public class Customer {
	
	//encapsulation is used here because the list stores transactions but can also contain
	//refunds and purchases because they are subtypes of transactions
	private ArrayList<Transaction> transactions;
	
	/**
	 * this creates a new customer with an empty transaction list 
	 */
	
	public Customer() {
		this.transactions = new ArrayList<>();
	}
	
	/**
	 * this method them adds a new transaction to the customer
	 * @param t
	 */
	
	//used void because when the method passes a purchase or refund into transact it is added into
	//the customers transaction history so there is no need for the method to return anything 
	public void transact(Transaction t) {
		transactions.add(t);
	}
	
	/**
	 * this then returns the total value of all transactions
	 * purchases are always +ve while refunds are always -ve
	 * @return the total in pennies
	 */
	public int getTotal() {
		int total = 0;
		for (Transaction t: transactions) {
			total += t.getValue();
		}
		return total;
	}
	/**
	 * this returns the customers list of transactions
	 * @return the list 
	 */
	public ArrayList<Transaction>getTransactions() {
		return transactions;
		}
}
