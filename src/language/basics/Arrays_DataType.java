package language.basics;

public class Arrays_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] result = new String[5][2][6];
// sem1 subjects
		
		result[0][0][0] = "Mathematics I";
		result[0][0][1] = "Physics";
		result[0][0][2] = "Chemistry";
		result[0][0][3] = "Computer Programming";
		result[0][0][4] = "Engineering Drawing";
		result[0][0][5] = "Basic Electrical Eng.";
		
//Sem1 Marks
		
		result[0][1][0] =	"Pass(78)";
		result[0][1][1] =	"Pass(85)";
		result[0][1][2] =	"Fail(21)";
		result[0][1][3] =	"Pass(74)";
		result[0][1][4] =	"Pass(88)";
		result[0][1][5] =	"Pass(79)";
		
// sem2 subjects
		
		result[1][0][0] = "Mathematics II";
		result[1][0][1] = "Mechanics";
		result[1][0][2] = "Environmental Sci.";
		result[1][0][3] = "Basic Electronics";
		result[1][0][4] = "Engineering Physics";
		result[1][0][5] = "Engineering Graphics";
//Sem2 Marks
		
		result[1][1][0] =	"Pass(82)";
		result[1][1][1] =	"Pass(77)";
		result[1][1][2] =	"Pass(93)";		
	    result[1][1][3] =	"Fail(19)";
		result[1][1][4] =	"Fail(24)";		
		result[1][1][5] =	"Pass(90)";	
		
// sem3 subjects
		
	    result[2][0][0] = "Data Structures";
		result[2][0][1] = "Discrete Mathematics";
		result[2][0][2] = "Digital Electronics";
		result[2][0][3] = "Operating Systems";
		result[2][0][4] = "Signals and Systems";
		result[2][0][5] = "Object-Oriented Prog.";
				
//Sem3 Marks
				
		result[2][1][0] =	"Pass(88)";
		result[2][1][1] =	"Pass(81)";
		result[2][1][2] =	"Pass(76)";		
		result[2][1][3] =	"Fail(32)";
		result[2][1][4] =	"Pass(85)";		
		result[2][1][5] =	"Pass(78)";	
		
//sem4 subjects
		
	    result[3][0][0] = "Data Structures";
		result[3][0][1] = "Computer Networks";
		result[3][0][2] = "Database Systems";
		result[3][0][3] = "Microprocessors";
		result[3][0][4] = "Communication Eng.";
		result[3][0][5] = "Software Engineering";
				
//Sem4 Marks
				
		result[3][1][0] =	"Pass(91)";
		result[3][1][1] =	"Pass(73)";
		result[3][1][2] =	"Fail(19)";		
		result[3][1][3] =	"Pass(80)";
		result[3][1][4] =	"Pass(76)";		
		result[3][1][5] =	"Pass(87)";
		
//sem5 subjects
		
	    result[4][0][0] = "Probability Stats";
		result[4][0][1] = "Machine Learning";
		result[4][0][2] = "Compiler Design";
		result[4][0][3] = "Theory of Computation";
		result[4][0][4] = "Embedded Systems";
		result[4][0][5] = "Computer Graphics";
				
//Sem5 Marks
				
		result[4][1][0] =	"Pass(86)";
		result[4][1][1] =	"Pass(88)";
		result[4][1][2] =	"Pass(84)";		
		result[4][1][3] =	"Pass(95)";
		result[4][1][4] =	"Pass(73)";		
		result[4][1][5] =	"Pass(90)";		
		
//Print Semester 2 Subject 4 and Subject 5 names.
		
		System.out.println("Semester 2 Subject 4:"  +result[1][0][3]);
		System.out.println("Semester 2 Subject 5:"  +result[1][0][4]);
		
//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.	
		
		System.out.println("Semester 4 Subject 3 marks:"  +result[3][1][2]);
		System.out.println("Semester 4 Subject 6 marks:"  +result[3][0][5]);
	}
	

}
