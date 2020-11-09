
/* This class sets an items information such as name, quantity, price and supplier information
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class Item {
	
	private String itemName;
	private int itemId;
	private int itemQuantity;
	private double itemPrice;
	private int supplierId;
	private Supplier itemSupplier;
	
		
	public Item(int itemId, String itemName, int itemQuantity, double itemPrice, int supplierId, Supplier itemSupplier) {
		this.itemName = itemName;
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.supplierId = supplierId;
		this.itemSupplier = itemSupplier;
	}
	
	/*
	 * prints to console tool stats
	 */
	public void searchTool() {
		System.out.println("Item ID: " + itemId + ", Item Name: " + itemName + ", Item Quantity: " + itemQuantity);
	}
	
	/*
	 *  check item quantity
	 *  returns item quantity --> this method used in decreseItem() to check if quantity is <40 and make an order if required
	 */
	public int checkItemQuantity() {
		System.out.println("Item quantity: " + itemQuantity);
		return itemQuantity;
	}

	/*
	 *  decrease item quantity by 1 (simulating 1 sale of the item)
	 */
	public void decreaseQuantity() {
		System.out.println("Original item quantity: " + itemQuantity);
		itemQuantity--;
		System.out.println("New item quantity: " + itemQuantity);
		
		if (itemQuantity < 40) {
			System.out.println("Less than 40 peices left, making new order!");
		}
	}
	
	

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Supplier getItemSupplier() {
		return itemSupplier;
	}

	public void setItemSupplier(Supplier itemSupplier) {
		this.itemSupplier = itemSupplier;
	} 
	
	

}
