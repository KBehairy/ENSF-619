import java.util.ArrayList;

/* This class contains methods to interact with the inventory of the shop
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class Inventory {
	
	private ArrayList <Item> itemList;
	private Order myOrder;
	
	/*
	 * sets itemList
	 * @param itemList - arraylist of all items in the shop along with each item's details
	 */
	public Inventory (ArrayList <Item> itemList) {
		this.itemList = itemList;
		myOrder = new Order();
	}
	
	/*
	 * list all tools available in the shop and each tools' details
	 */
	public void printAllTools() {
		for(Item i : itemList) {
			i.searchTool();
		}
	}
	
	/*
	 * delete tool from shop
	 * @param tool name
	 */
	public void deleteItemByName(String name) {
		Item item = getItemByName(name);
		itemList.remove(item);
	}
	
	/*
	 * add tool to shop
	 * @param tool name
	 * @param tool id
	 * @param tool quantity
	 * @param tool price
	 * @param tool's supplier id
	 * @param tool's supplier information
	 */
	public void addItem(String itemName, int itemId, int itemQuantity, double itemPrice, int supplierId, Supplier itemSupplier) {
		Item item = new Item(itemId, itemName, itemQuantity, itemPrice, supplierId, itemSupplier);
		itemList.add(item);
	}
	
	/*
	 * search tool by name
	 * @param tool name
	 */
	public Item searchItemName(String name) {
		Item item = null;
		for(Item i : itemList) {
			if(name.contentEquals(i.getItemName())) {
				item = i;
				item.searchTool();
				break;
			}
		}
		if(item == null)
			System.out.println("Item not found!");
		return item;
	}
	
	/*
	 * search tool by id
	 * @param tool id
	 */
	public Item searchItemId(int id) {
		Item item = null;
		for(Item i : itemList) {
			if(id == i.getItemId()) {
				item = i;
				item.searchTool();
				break;
			}
		}
		if(item == null)
			System.out.println("Item not found!");
		return item;
	}
	
	/*
	 * get tool quantity in shop
	 * @param tool name
	 */
	public void checkItemQuantity(String name) {
		Item itemName = getItemByName(name);
		if(itemName != null) {
			itemName.checkItemQuantity();
		}
	}
	
	/*
	 * get tool by searching its name
	 * @param tool name
	 */
	public Item getItemByName(String name) {
		Item item = null;
		for(Item i : itemList) {
			if(name.contentEquals(i.getItemName())) {
				item = i;
				break;
			}
		}
		if(item == null) {
			System.out.println("Item not found!");
		}
			
		return item;
	}
	
	/*
	 * decrease item quantity by 1
	 * simulate 1 sale
	 * @param tool name
	 */
	public void decreaseItem(String name) {
		Item item = getItemByName(name);
		if(item != null) {
			item.decreaseQuantity();
		}
	}
	
	/*
	 * check all items in inventory and make required orderList
	 */
	public void makeOrder() {
		Item item = null;
		for(Item i : itemList) {
			item = i;
			if(item.getItemQuantity() < 40) {
				myOrder.makeOrder(item);
			}
		}		
	}
	
	public void printTodaysOrder() {
		myOrder.printTodaysOrder();
	}
	
	public Order getMyOrder() {
		return myOrder;
	}
	public void setMyOrder(Order myOrder) {
		this.myOrder = myOrder;
	}
	public ArrayList <Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList <Item> itemList) {
		this.itemList = itemList;
	}
	

	
	
	

}
