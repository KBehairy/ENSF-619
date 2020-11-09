
/* This class contains methods to allow front end to interact with the rest of the classes and do things
 * like make orders, check items in inventory, sell an item
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class Shop {
	
	private Inventory theInventory;
	private SupplierList theSuppliers;
	
	public Shop (Inventory inventory, SupplierList suppliers) {
		setTheInventory(inventory);
		setTheSuppliers(suppliers);
	}
	
	/*
	 *  list all tools
	 */
	public void listAllTools() {
		theInventory.printAllTools();
	}
	
	/*
	 *  list all suppliers
	 */
	public void listAllSuppliers() {
		theSuppliers.printAllSuppliers();
	}
	
	/*
	 *  search tool by name
	 *  @param tool name
	 */
	public void searchToolName(String name) {
		theInventory.searchItemName(name);
	}
	
	/* 
	 * search tool by Id
	 * @param tool id
	 */
	public void searchToolId(int id) {
		theInventory.searchItemId(id);
	}

	/*
	 *  check item quantity
	 *  @param tool name
	 */
	public void checkItemQuantity(String name) {
		theInventory.checkItemQuantity(name);
	}
	
	/*
	 *  decrease item quantity by 1 (simulates a sale of the item)
	 *  @param tool name
	 */
	public void decreaseItem(String name) {
		theInventory.decreaseItem(name);
		theInventory.makeOrder();
	}
	
	/*
	 * make order
	 */
	public void makeOrder() {
		theInventory.makeOrder();
		
	}
	
	/*
	 * print today's order
	 */
	public void printTodaysOrder() {
		theInventory.printTodaysOrder();
	}
	
	
	
	public SupplierList getTheSuppliers() {
		return theSuppliers;
	}

	public void setTheSuppliers(SupplierList theSuppliers) {
		this.theSuppliers = theSuppliers;
	}

	public Inventory getTheInventory() {
		return theInventory;
	}

	public void setTheInventory(Inventory theInventory) {
		this.theInventory = theInventory;
	}
	
	

}
