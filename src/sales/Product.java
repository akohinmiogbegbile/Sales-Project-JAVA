package sales;

public class Product implements Saleable{
	private int price;
	private int weight;
	
	public Product (int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
	public int calculateDelivery() {
		if (weight < 100) {
			return 0;
		} else if (weight <1000) {
			return(int)(weight * 0.2); 
		} else {
			int firstThousand = (int)(1000 * 0.2);
			int remaining = weight - 1000;
			int remainingCharge = (int)(remaining * 0.1);
			return firstThousand + remainingCharge;
		}
	}
}
