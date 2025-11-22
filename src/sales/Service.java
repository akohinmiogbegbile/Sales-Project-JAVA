package sales;

public class Service implements Saleable {
	
	private int price;
	
	public Service (int price) {
		this.price = price;
	}
	
	@Override //to allow the getPrice method which was taken from the Saleable interface
	public int getPrice() {
		return price;
	}

}
