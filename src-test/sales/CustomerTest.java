package sales;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	@Test
	public void testNoTransactions() {
		Customer c  = new Customer();
		assertEquals(0, c.getTotal());
	}
	
	@Test
	public void testOnlyPurhases() {
		Customer c = new Customer();
		
		Product p = new Product(1000, 200);
		Service s = new Service(2500);
		
		c.transact(new Purchase(p, 2));
		c.transact(new Purchase (s, 1));
		
		assertEquals(4500, c.getTotal());
	}
	
	@Test
	public void testOnlyRefunds() {
		Customer c = new Customer();
		
		c.transact(new Refund(500, "Faulty item"));
		c.transact(new Refund(-300, "Adjustment"));
		
		assertEquals(-800, c.getTotal());
	}
	
	@Test
	public void testMixedTransactions() {
		Customer c = new Customer();
		
		Product p = new Product(2000, 150);
		
		c.transact (new Purchase(p,1));
		c.transact(new Refund(500, "the item is too expensive"));
		
		assertEquals(1500, c.getTotal());
		
	}

}


