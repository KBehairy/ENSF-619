import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/* This class contains methods to create arraylists of Supplier and Item objects from input text files
 * Acts as a simulation for loading data from a database
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class FileManager {

	ArrayList<Supplier> supplierList;
	ArrayList<Item> itemList;
	
	public FileManager() {
		this.supplierList = readSuppliers();
		this.itemList = readItems();
	}
	
	
	/*
	 * read suppliers.txt and populate arrayList
	 */
	public ArrayList<Supplier> readSuppliers(){
		ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
		try {
			FileReader fr = new FileReader("C:\\Users\\khale\\Desktop\\MEng Software Engineering\\ENSF 607\\Labs\\Lab 3\\src\\suppliers.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null) {
				String temp[] = line.split(";");
				Supplier supplier= new Supplier(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3]);
				suppliers.add(supplier);
			}
		} catch (Exception e) {
			System.out.println("Error reading file");
			return null;
		}
		return suppliers;
	}
	
	
	/*
	 * read items.txt and populate arrayList
	 */
	public ArrayList<Item> readItems(){
		ArrayList<Item> items = new ArrayList<Item>();
		try {
			FileReader fr = new FileReader("C:\\Users\\khale\\Desktop\\MEng Software Engineering\\ENSF 607\\Labs\\Lab 3\\src\\items.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null) {
				String temp[] = line.split(";");
				int supplierId = Integer.parseInt(temp[4]);
				Supplier supplier = null;
				for(Supplier s : supplierList) {
					if(supplierId == s.getSupplierId()) {
						supplier= s;
					}
				}
				Item item = new Item(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), supplier);
				items.add(item);
			}
		} catch (Exception e) {
			System.out.println("Error reading file");
			return null;
		}
		return items;
	}
	
	
}