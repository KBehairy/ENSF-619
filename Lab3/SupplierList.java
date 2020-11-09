import java.util.ArrayList;

/* This class contains methods to print all supplier information to console
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class SupplierList {
	
	private ArrayList <Supplier> supplierList;
//	private Supplier supplier;
	
	public SupplierList (ArrayList <Supplier> supplierList) {
		this.setSupplierList(supplierList);
	}
	
	/*
	 * list all suppliers
	 */
	public void printAllSuppliers() {
		for(Supplier i : supplierList) {
			i.searchSupplier();
		}
	}

	public ArrayList <Supplier> getSupplierList() {
		return supplierList;
	}

	public void setSupplierList(ArrayList <Supplier> supplierList) {
		this.supplierList = supplierList;
	}
	
	

}
