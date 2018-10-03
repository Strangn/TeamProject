package ch08_prj2_PersonManager;

public class Customer extends Person{
	private String customerNumber;
	
	public Customer(String first, String last, String number) {
		super(first, last);
		this.customerNumber = number;
	}
	public String getCustomerNumber()  {
		return customerNumber;
	}
	public void setCustomerNumber(String number)  {
		this.customerNumber = number;
	}
	@Override
	public String toString()  {
		String name = super.toString();
		return name + "/n" + "Customer Number: " + customerNumber;
	}
}
