package assignments;

import java.util.*;

public class ConditionalStatementsAndLoops{



    public static void main(String[] args) {
       
    	
        Map<String, Double> hikePercentageMap = new HashMap<>();

        Employee[] employee;
		for (Employee emp : employee) {
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



