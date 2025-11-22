package sales;

public class Main {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Product laptop = new Product (80000, 1500);
		Product usbCable = new Product (500, 50);
		
		Service repair = new Service(3000);
		
		c.transact(new Purchase(laptop, 1));
		c.transact(new Purchase(usbCable, 1));
		c.transact(new Purchase(repair, 1));
		
		c.transact(new Refund(500, "Returned USB calble"));
		
		System.out.println("Customer total (in pennies): " + c.getTotal());
		System.out.println("Laptop delivery: " + laptop.calculateDelivery());
		System.out.println("USB Cable delivery: " + usbCable.calculateDelivery());
	}

}
