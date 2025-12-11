package sales;

public class Main {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Product efootballPlaque = new Product (80000, 1500);
		Product xboxController = new Product (5000, 275);
		
		Service repair = new Service(3000);
		Refund refundController = new Refund(5000, "Returned xBoxController");
		c.transact(refundController);
		
		
		c.transact(new Purchase(efootballPlaque, 1));
		c.transact(new Purchase(xboxController, 1));
		c.transact(new Purchase(repair, 1));
		
		//c.transact(new Refund(500, "Returned xboxController"));
		
		System.out.println("----- TRANSACTIONS -----");
		//divided by 100 to change the printed version from pennies to pound
		System.out.println("Items Purchased: eFootball Plaque (£" + (efootballPlaque.getPrice()/100.0) + ")");
		System.out.println("Items Purchased: Xbox Controller (£" + (xboxController.getPrice()/100.0) + ")");
		System.out.println("Items Purchased: Repair Service (£" + (repair.getPrice()/100.0) + ")");
		//System.out.println("Items Refunded: Xbox Controller (-£" + (500/100.0) + ")");
		
		//used maths absolutes because refund values are -ve and i don't want "-£-5.00" to be printed
		System.out.println("Items Refunded: xBox Controller (-£" + Math.abs(refundController.getValue())/100.0 + ")");
		
		System.out.println("\n----- DELIVERY COSTS -----");
		System.out.println("eFootball Plaque delivery: £" + efootballPlaque.calculateDelivery()/100.0);
		System.out.println("Xbox Controller delivery: £" + xboxController.calculateDelivery()/100.0);

		System.out.println("\n----- FINAL TOTAL -----");
		System.out.println("Customer total: £" + c.getTotal()/100.0);

	}

}
