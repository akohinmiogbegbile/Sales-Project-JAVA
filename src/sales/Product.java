package sales;

public class Product implements Saleable{ //product provides the getPrice method from that interface 
	private int price;
	private int weight;
	
	public Product (int price, int weight) {
		this.price = price;
		this.weight = weight;
	}
	
	//because the method comes from saleable.
	@Override 
	public int getPrice() {
		return price;
	}
	
	public int calculateDelivery() {
		//if the weight is less than 100g then the delivery is free
		if (weight < 100) {
			return 0;
		//if the weight is between 100 and 999g then the delivery cost is 20% of the weight 
		} else if (weight <1000) {
			return(int)(weight * 0.2); 
		//if the weight is 1000g or more the first 1000g would cost 20% then the rest after would be 10%
		} else {
			int firstThousand = (int)(1000 * 0.2);
			int remaining = weight - 1000;
			int remainingCharge = (int)(remaining * 0.1);
			return firstThousand + remainingCharge; 
		}
	}
}
