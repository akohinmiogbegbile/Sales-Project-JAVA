package sales;

/**
 * this class represents a customer buying an item that is saleable
 * the value of the item is calculated by multiplying the price by the quantity
 */

//inheritance in action since purchase is a child class of transaction
public class Purchase extends Transaction{
	
	private Saleable item;
	private int quantity;
	
	/**
	 * this method creates a new purchase
	 * @param item the saleable item that is being bought
	 * @param quantity how many (in quantity) of the saleable item was bought
	 */
	
	public Purchase(Saleable item, int quantity) {
		//NB - the "super" calls the transaction constructor
		//so a product has a price which is then multiplied by the quantity which then becomes 
		//the transaction value which is then stored in the transaction superclass
		super(item.getPrice() * quantity); 
		this.item = item;
		this.quantity = quantity;
	}
	
	/**
	 * returns the saleable item
	 * @return the item
	 */
	
	public Saleable getItem() {
		return item;
	}
	
	/**
	 * this method returns the quantity that was bought
	 * @return the quantity
	 */
	
	public int getQuantity() {
		return quantity;
	}
}
