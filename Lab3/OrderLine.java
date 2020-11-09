
/* This class contains methods to create an orderline for each item that has quantity < 40
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class OrderLine {
	
	private Item item;
	private String itemName;
	private int itemQuantity;

	/*
	 * constructor for orderline
	 * creates orderline for item
	 * @param item
	 */
	public OrderLine(Item item) {
		this.item = item;
		this.itemName = item.getItemName();
		this.itemQuantity = item.getItemQuantity() + 40;
	}
	
	/*
	 * make order line for item
	 * @param item
	 */
	public OrderLine makeOrderLine(Item item) {
		OrderLine orderLine = new OrderLine(item);
		return orderLine;
	}
	
	/*
	 * print orderline to console
	 */
	public void printOrderLine() {
		System.out.println("Item description: " + item.getItemName() + "\nAmount Ordered:   " + (item.getItemQuantity() + 40) + "\nSupplier:         " + item.getItemSupplier().getSupplierName());
		System.out.println();
	}

}
