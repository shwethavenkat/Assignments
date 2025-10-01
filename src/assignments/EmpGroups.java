package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[3][3];
		data[0][0] = "1234";
		data[0][1] = "1235"; 
		data[0][2] = "1236";
		
//emp names
		data[1][0] = "Bharath";
		data[1][1] = "ABC"; 
		data[1][2] = "XYZ";
	Employee obj = new Employee();
	System.out.println(obj.empnames[0] + + obj.empnum[0] );
	System.out.println(obj.empnames[1] + obj.empnum[1] );
	System.out.println(obj.empnames[2] + obj.empnum[2] );
	}
	
	

}
