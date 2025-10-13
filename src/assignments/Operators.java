package assignments;

public class Operators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String studName[] = { "Suresh", "Mahesh", "Naresh" };
		int studMarks[] = { 75, 80, 82 };
		int total_marks = 0;
		float average = 0;
		int updatedMarks[] = new int[studMarks.length];
		for (int i = 0; i < studMarks.length; i++) {
			updatedMarks[i] = studMarks[i] + 10;
			total_marks += updatedMarks[i];
			average = total_marks / 3;
		}
		System.out.println(studName[0] + ":" + updatedMarks[0]);
		System.out.println(studName[1] + ":" + updatedMarks[1]);
		System.out.println(studName[2] + ":" + updatedMarks[2]);

		System.out.println("average:" + average);

	}

}
