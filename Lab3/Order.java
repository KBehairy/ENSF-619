import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/* This class contains methods to create an order for items that have quantity < 40
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class Order {

	private ArrayList <OrderLine> todaysOrder;
	private int orderID;
	private String orderDate;
	
	public Order() {
		todaysOrder = new ArrayList<OrderLine>();
		this.setOrderID(generateOrderNum());
		this.orderDate = generateOrderDate();
	}

	/*
	 * generate random order number
	 */
	public int generateOrderNum() {
		int m = (int) Math.pow(6, 6 - 1);
	    return m + new Random().nextInt(6 * m);
	}
	
	/*
	 * generate order date
	 */
	public String generateOrderDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		return dtf.format(now);
	}
	
	/*
	 * make order for items that have quantity < 40
	 */
	public void makeOrder(Item item) {
		OrderLine orderLine = new OrderLine(item);
		if(orderLine != null) {
			this.todaysOrder.add(orderLine);
		}
	}
	
	/*
	 * print todays order and details to console
	 */
	public void printTodaysOrder() {
		System.out.println("Order ID: " + getOrderID());
		System.out.println("Date Ordered: " + orderDate);
		System.out.println();
		for(OrderLine i : todaysOrder) {
			i.printOrderLine();
		}
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	

	

	
}
