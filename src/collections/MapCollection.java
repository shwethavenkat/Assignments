package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Below Stud1Map details are stored using Map(HashMap)

				Map<String, String> Stud1Map = new HashMap<String, String>();
				Stud1Map.put("Name", "Jhon Doe");
				Stud1Map.put("Age", "20");
				Stud1Map.put("Gender", "Male");
				Stud1Map.put("Roll Number", "S12345");
				Stud1Map.put("Grade", "A");
				Stud1Map.put("Major", "Computer Science");
				Stud1Map.put("GPA", "3.8");
				Stud1Map.put("Email", "john@example.com");
				Stud1Map.put("Contact Number", "9999997777");
				Stud1Map.put("Address", "123 Elm St");
				System.out.println("Student 1 details :" + Stud1Map);

				// Below Stud2Map details are stored using Map(HashMap)

				Map<String, String> Stud2Map = new HashMap<String, String>();
				Stud2Map.put("Name", "Jane Smith");
				Stud2Map.put("Age", "21");
				Stud2Map.put("Gender", "Female");
				Stud2Map.put("Roll Number", "S12346");
				Stud2Map.put("Grade", "B");
				Stud2Map.put("Major", "Mathematics");
				Stud2Map.put("GPA", "3.5");
				Stud2Map.put("Email", "jane@example.com");
				Stud2Map.put("Contact Number", "9876665666");
				Stud2Map.put("Address", "456 Oak St");
				System.out.println("Student 2 details :" + Stud2Map);

				// Below Stud3Map details are stored using Map(HashMap)

				Map<String, String> Stud3Map = new HashMap<String, String>();
				Stud3Map.put("Name", "Mike Brown");
				Stud3Map.put("Age", "22");
				Stud3Map.put("Gender", "Male");
				Stud3Map.put("Roll Number", "S12347");
				Stud3Map.put("Grade", "A");
				Stud3Map.put("Major", "Physics");
				Stud3Map.put("GPA", "3.9");
				Stud3Map.put("Email", "mike@example.com");
				Stud3Map.put("Contact Number", "8787876546");
				Stud3Map.put("Address", "789 Pine St");
				System.out.println("Student 3 details :" + Stud3Map);

				// Stud1Map,Stud2Map,Stud3Map details are added under List (studentList)

				List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
				studentList.add(Stud1Map);
				studentList.add(Stud2Map);
				studentList.add(Stud3Map);
				System.out.println("Student List :" + studentList);

				// Below Emp1Map details are stored using Map(HashMap)

				Map<String, String> Emp1Map = new HashMap<String, String>();
				Emp1Map.put("Employee ID", "E001");
				Emp1Map.put("Name", "Alice Green");
				Emp1Map.put("Age", "30");
				Emp1Map.put("Gender", "Female");
				Emp1Map.put("Department", "Engineering");
				Emp1Map.put("Position", "Software Engineer");
				Emp1Map.put("Salary", "75,000");
				Emp1Map.put("Email", "alice@example.com");
				Emp1Map.put("Contact Number", "9876543213");
				System.out.println("Employee 1 details :" + Emp1Map);

				// Below Emp2Map details are stored using Map(HashMap)

				Map<String, String> Emp2Map = new HashMap<String, String>();
				Emp2Map.put("Employee ID", "E002");
				Emp2Map.put("Name", "Bob Johnson");
				Emp2Map.put("Age", "35");
				Emp2Map.put("Gender", "Male");
				Emp2Map.put("Department", "Marketing");
				Emp2Map.put("Position", "Marketing Manager");
				Emp2Map.put("Salary", "85,000");
				Emp2Map.put("Email", "bob@example.com");
				Emp2Map.put("Contact Number", "9876543214");
				System.out.println("Employee 2 details :" + Emp2Map);

				// Below Emp3Map details are stored using Map(HashMap)

				Map<String, String> Emp3Map = new HashMap<String, String>();
				Emp3Map.put("Employee ID", "E003");
				Emp3Map.put("Name", "Carol White");
				Emp3Map.put("Age", "28");
				Emp3Map.put("Gender", "Female");
				Emp3Map.put("Department", "Sales");
				Emp3Map.put("Position", "Sales Executive");
				Emp3Map.put("Salary", "65,000");
				Emp3Map.put("Email", "carol@example.com");
				Emp3Map.put("Contact Number", "9876543215");
				System.out.println("Employee 3 details :" + Emp3Map);

				// Emp1Map,Emp2Map,Emp3Map details are added under List (empList)

				List<Map<String, String>> empList = new ArrayList<Map<String, String>>();
				empList.add(Emp1Map);
				empList.add(Emp2Map);
				empList.add(Emp3Map);
				System.out.println("Employee List :" + empList);

				// Below Product1Map details are stored using Map(HashMap)

				Map<String, String> Prod1Map = new HashMap<String, String>();
				Prod1Map.put("Product ID", "P001");
				Prod1Map.put("Name", "Laptop");
				Prod1Map.put("Category", "Electronics");
				Prod1Map.put("Price", "$1,200");
				Prod1Map.put("Stock Quantity", "50");
				Prod1Map.put("Supplier", "Tech Supplies");
				Prod1Map.put("Warranty", "2 years");
				Prod1Map.put("Rating", "4.5");
				Prod1Map.put("Manufacturing Date", "15-01-2023");
				Prod1Map.put("Expiry Date", "15-01-2025");
				System.out.println("Product 1 details :" + Prod1Map);

				// Below Prod2Map details are stored using Map(HashMap)

				Map<String, String> Prod2Map = new HashMap<String, String>();
				Prod2Map.put("Product ID", "P002");
				Prod2Map.put("Name", "Desk Chair");
				Prod2Map.put("Category", "Furniture");
				Prod2Map.put("Price", "$150");
				Prod2Map.put("Stock Quantity", "200");
				Prod2Map.put("Supplier", "Office Depot");
				Prod2Map.put("Warranty", "1 year");
				Prod2Map.put("Rating", "4");
				Prod2Map.put("Manufacturing Date", "10-02-2023");
				Prod2Map.put("Expiry Date", "N/A");
				System.out.println("Product 2 details :" + Prod2Map);

				// Below Prod3Map details are stored using Map(HashMap)

				Map<String, String> Prod3Map = new HashMap<String, String>();
				Prod3Map.put("Product ID", "P003");
				Prod3Map.put("Name", "Coffee Maker");
				Prod3Map.put("Category", "Kitchen");
				Prod3Map.put("Price", "$75");
				Prod3Map.put("Stock Quantity", "100");
				Prod3Map.put("Supplier", "KitchenWorld");
				Prod3Map.put("Warranty", "6 months");
				Prod3Map.put("Rating", "4.2");
				Prod3Map.put("Manufacturing Date", "20-03-2023");
				Prod3Map.put("Expiry Date", "20-03-2024");
				System.out.println("Product 3 details :" + Prod3Map);

				// Prod1Map,Prod2Map,Prod3Map details are added under List (ProdList)

				List<Map<String, String>> ProdList = new ArrayList<Map<String, String>>();
				ProdList.add(Prod1Map);
				ProdList.add(Prod2Map);
				ProdList.add(Prod3Map);
				System.out.println("Prod List :" + ProdList);

				// To access all data of studentList,empList,ProdList are mapped under Map(HashMap)

				Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
				data.put("StudentData", studentList);
				data.put("EmployeeData", empList);
				data.put("ProductData", ProdList);
				System.out.println("All Data List :" + data);
				System.out.println("***********************************************************");
				System.out.println("Supplier Name of 2nd row of ProductData: "+ data.get("ProductData").get(1).get("Supplier"));

			}

		}