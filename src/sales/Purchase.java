package sales;

//inheritance in action since purchase is a child class of transaction
public class Purchase extends Transaction{
	
	private Saleable item;
	private int quantity;
	
	public Purchase(Saleable item, int quantity) {
		//NB - the "super" calls the transaction constructor
		//so a product has a price which is then multiplied by the quantity which then becomes 
		//the transaction value which is then stored in the transaction superclass
		super(item.getPrice() * quantity); 
		this.item = item;
		this.quantity = quantity;
	}
	
	public Saleable getItem() {
		return item;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
