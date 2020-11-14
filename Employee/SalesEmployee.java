
public class SalesEmployee extends Employee{
	private double sales;
	
	public SalesEmployee(String name, String phoneNumber, String email, double sales){
		super(name,phoneNumber,email);
		this.sales = sales;
	}
}
