
/* This class sets information of each supplier
 * and contains methods to do things like search for a supplier and get a supplier's contact information
 * 
 * Edited by:  Khaled Behairy
 * @since 10/13/2020
*/

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private String supplierContact;
	
	public Supplier(int supplierId, String supplierName, String supplierAddress, String supplierContact) {
		this.setSupplierId(supplierId);
		this.setSupplierName(supplierName);
		this.setSupplierAddress(supplierAddress);
		this.setSupplierContact(supplierContact);
	}
	
	/*
	 * search for a supplier
	 * print supplier's info to console
	 */
	public void searchSupplier() {
		System.out.println("Supplier ID: " + supplierId + ", Supplier Name: " + supplierName + ", Supplier Address: " + supplierAddress + " Supplier Contact: " + supplierContact);
	}
	
	/*
	 * get a supplier's contact person
	 */
	public String getSupplierContact() {
		return supplierContact;
	}

	
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

}
