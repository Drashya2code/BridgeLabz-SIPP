import java.util.*;


class Student{
	String studentName;
	String[] subjectName = new String[5];
	int[] marks = new int[5];
	char[] grade = new char[5];
	char finalGrade;
	
	public Student(String studentName, String[] subjectName, int[] marks) {
		this.studentName = studentName;
		this.subjectName = subjectName;
		this.marks = marks;
		this.grade = calculateGrade();
		this.finalGrade = calculateFinalGrade();
	}
	
	private char calculateFinalGrade() {
		int marksSum = 0;
		for(int i = 0;i<marks.length;i++) {
			marksSum+=marks[i];
		}
		int avgMark = (int) marksSum/subjectName.length;
		
		if(avgMark >=90) return 'A';
		if(avgMark >= 80 && avgMark<90)  return 'B';
		if(avgMark >= 70 && avgMark<80) return 'C';
		else return 'F';
	}
	

	private char[] calculateGrade() {
		char[] grades = new char[marks.length];
		for(int i = 0;i<marks.length;i++) {
			int mark = marks[i];
			if(mark >=90) grades[i] = 'A';
			if(mark >= 80 && mark<90) grades[i] = 'B';
			if(mark >= 70 && mark<80) grades[i] = 'C';
			else grades[i] = 'F';
		}
		return grades;
	}
	
}
	
	



public class reportCardByMe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> reportCard = new ArrayList<>();
		
		System.out.println("Enter No. of Student: ");
		int noOfStudent = sc.nextInt();
		sc.nextLine(); // Consume the newline character after reading the integer
		while(noOfStudent-- > 0) {
			
			System.out.println("Enter student name");
			String name = sc.nextLine();
			
			int noOfSubject = 5;
			String[] subjectName = {
					"Maths", "Science", "Social", "English", "Hindi"
			};
			
			int[] marks = new int[noOfSubject];
			
			for(int i = 0;i<noOfSubject;i++) {
				System.out.print("Marks of "+subjectName[i] + " : ");
				marks[i] = sc.nextInt();
				System.out.println();
			}			
			
			Student student = new Student(name, subjectName, marks);
			
			reportCard.add(student);
			}
		
		System.out.println("Your Report Card");
		
		for(int i = 0;i<reportCard.size();i++) {
			System.out.println("Student Name: "+ reportCard.get(i).studentName);
			for(int j = 0;j<reportCard.get(i).subjectName.length;j++) {
				System.out.println(reportCard.get(i).subjectName[j] + " " + reportCard.get(i).marks[j]);
			}
			System.out.println("Final Grade "+ reportCard.get(i).finalGrade);
			System.out.println();
		}
		
		sc.close();
	}

}
