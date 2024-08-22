package Cust_prj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
	public static void main(String[]args){
		 List<customer> customers = new ArrayList<>();
	        customers.add(new customer(1, "John Doe", "Delhi", 90000, new Date(90, 0, 15))); 
	        customers.add(new customer(2, "Jane Smith", "Mumbai", 75000, new Date(85, 5, 25)));  
	        customers.add(new customer(3, "Michael Brown", "Delhi", 85000, new Date(88, 3, 10)));  
	        customers.add(new customer(4, "Sarah Johnson", "Chennai", 82000, new Date(92, 11, 30)));
	        customers.add(new customer(5, "James Davis", "Kolkata", 67000, new Date(95, 2, 5)));  
	        customers.add(new customer(6, "Emily Wilson", "Delhi", 89000, new Date(99, 7, 22)));  
	        customers.add(new customer(7, "Daniel Garcia", "Bangalore", 92000, new Date(87, 9, 9))); 
	        customers.add(new customer(8, "Emma Martinez", "Hyderabad", 70000, new Date(94, 4, 14)));  
	        customers.add(new customer(9, "Oliver Anderson", "Delhi", 95000, new Date(93, 1, 19)));  
	        customers.add(new customer(10, "Sophia Taylor", "Mumbai", 81000, new Date(98, 10, 2)));  

	        System.out.println("All Customers:------------------------------------------------------------------------------------");
	        customers.stream().forEach(y -> {
				System.out.println(y);
			});
	        
	        System.out.println("\nCustomers with premium > 80000:-----------------------------------------------------------------");
	        customers.stream().filter(c -> c.getPremium() > 80000).forEach(y -> {
				System.out.println(y);
			});
	        
	        System.out.println("\nCustomers from Delhi:---------------------------------------------------------------------------");
	        customers.stream().filter(x -> x.getCity().equals("Delhi")).forEach(y -> {
				System.out.println(y);
	        });
	        
	        System.out.println("\nCustomers sorted by Customer Name:--------------------------------------------------------------");
	        customers.stream().sorted((c1, c2) -> c1.getCustName().compareTo(c2.getCustName())).forEach(y -> {
	    				System.out.println(y);
	    	        });


	}
	

}
