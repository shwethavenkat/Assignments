package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsInJava {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		Map<String,Map<String,String>> prodDetails = new HashMap<String,Map<String,String>>();
		
		//System.out.println("Hello");

		//Create a new inner map for the product
        Map<String, String> supplierDetails = new HashMap<String, String>();		
        supplierDetails.put("Laptop", "Tech Supplies");
        supplierDetails.put("Desk Chair", "Office Depot");
        supplierDetails.put("Coffee Maker", "KitchenWorld");
        
     // Put the inner map into the outer map with the product key
        prodDetails.put("P001", supplierDetails);
        prodDetails.put("P002", supplierDetails);
        prodDetails.put("P003", supplierDetails);
        
        String details = prodDetails.get("P002").get("Desk Chair");
        System.out.println(details);
	}

}
