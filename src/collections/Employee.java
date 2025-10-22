package collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Employee {
	
	
	    String name;
	    double baseSalary;
	    double experience;
	    double rating;

	  Employee(String name, double baseSalary, double experience, double rating) {
	        this.name = name;
	        this.baseSalary = baseSalary;
	        this.experience = experience;
	        this.rating = rating;
	        
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> employees = Arrays.asList(
		            new Employee("Alice Johnson", 75000.0, 5.1, 4.2),
		            new Employee("Bob Smith", 68000.0, 3.2, 3.8),
		            new Employee("Carol Davis", 82000.0, 7.1, 4.5),
		            new Employee("David Brown", 90000.0, 10.2, 2.5),
		            new Employee("Eva Green", 60000.0, 2.4, 3.5)
		        );

        Map<String, Double> hikePercentageMap = new HashMap<>();

        
		for (Employee emp : employees) {
            double variablePayPercent = 0.0;
            double bonus = 0.0;

            if (emp.rating >= 4.0) {
                variablePayPercent = 0.15;
                bonus = 1500;
            } else if (emp.rating >= 3.0) {
                variablePayPercent = 0.10;
                bonus = 1200;
            } else {
                variablePayPercent = 0.03;
                bonus = 300;
            }

            double reward = (emp.experience >= 5.0) ? 5000 : 0;

            double hike = (emp.baseSalary * variablePayPercent) + bonus + reward;
            double hikePercent = (hike / emp.baseSalary) * 100;

            // Round to 2 decimal places
            hikePercent = Math.round(hikePercent * 100.0) / 100.0;

            hikePercentageMap.put(emp.name, hikePercent);
        }

        // Print the result
        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue() + "%");
        }
    }


	}


