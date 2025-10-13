package collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data[] = { "Myntra", "Flipkart", "Amazon", "Nykaa", "Meesho", "Myntra", "Amazon" };
		Set<String> store = new HashSet<String>();
		for (String name : data) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element:" + name);
			}
		}

	}

}
