package sales;

public class Main {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Product efootballPlaque = new Product (80000, 1500);
		Product xboxController = new Product (500, 50);
		
		Service repair = new Service(3000);
		
		c.transact(new Purchase(efootballPlaque, 1));
		c.transact(new Purchase(xboxController, 1));
		c.transact(new Purchase(repair, 1));
		
		c.transact(new Refund(500, "Returned xboxController"));
		
		System.out.println("Customer total (in pennies): " + c.getTotal());
		System.out.println("Efootball Plaque delivery: " + efootballPlaque.calculateDelivery());
		System.out.println("Xbox Controller delivery: " + xboxController.calculateDelivery());
		

	}

}
