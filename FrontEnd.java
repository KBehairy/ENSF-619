import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* This class contains the front end for the application
 * Creates a console based front end where user can interact with the program
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class FrontEnd {
	
	private Shop theShop;
	private static Scanner scan;
	
	/*
	 * constructor for FrontEnd class
	 * populates supplierList and itemList from input text files
	 * and creates and initializes a shop
	 */
	public FrontEnd() {
		FileManager file = new FileManager();
		ArrayList <Supplier> supplierList = file.supplierList;
		ArrayList <Item> itemList = file.itemList;
		theShop = new Shop(new Inventory(itemList), new SupplierList(supplierList));
	}
	
	public void printMenuChoices(){
		System.out.println("\nSelect one of the following:");
		System.out.println("1. List all tools in the inventory");
		System.out.println("2. Search for tool by tool name");
		System.out.println("3. Search for tool by tool id");
		System.out.println("4. Check item quantity");
		System.out.println("5. Decrease item quantity");
		System.out.println("6. Print today's order");
		System.out.println("7. Quit");
		System.out.println();
		System.out.println("Please enter your selection: ");
	}

	public static void main(String[] args) {

		FrontEnd app = new FrontEnd();
		
		while(true) {
			app.printMenuChoices();
			scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				app.theShop.listAllTools();
				break;
			
			case 2:
				scan = new Scanner(System.in);
				System.out.println("\nPlease enter name of item you are looking for: ");
				String itemName = scan.nextLine();
				System.out.println();
				app.theShop.searchToolName(itemName);
				break;
			
			case 3:
				scan = new Scanner(System.in);
				System.out.println("\nPlease enter ID of item you are looking for: ");
				try {
					  int itemID = scan.nextInt(); 
					  System.out.println();
					  app.theShop.searchToolId(itemID);
					} catch (InputMismatchException e) {
					  System.out.println("Entered value is not an integer");
					  break;
					}
				break;
				
			case 4: 
				scan = new Scanner(System.in);
				System.out.println("\nPlease enter name of item you are want to check: ");
				itemName = scan.nextLine();
				System.out.println();
				app.theShop.checkItemQuantity(itemName);
				break;
				
			case 5:
				scan = new Scanner(System.in);
				System.out.println("\nPlease enter name of item you wish to decrease: ");
				itemName = scan.nextLine();
				System.out.println();
				app.theShop.decreaseItem(itemName);
				break;
				
			case 6:
				System.out.println("\nToday's Order: ");
				System.out.println();
				app.theShop.makeOrder();
				app.theShop.printTodaysOrder();
				break;
				
			case 7:
				System.out.println("\nGood Bye");
				System.exit(0); 
			}
		}	
		
	}

}
