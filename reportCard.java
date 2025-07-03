import java.util.*;

class StudentDatabase {
	private Student[] students;
	private int count;
	private int capacity;
	
	public StudentDatabase(int capacity) {
		this.capacity = capacity;
		this.students = new Student[capacity];
		this.count = 0;
	}
	
	public void addStudent(Student student) {
		if(count < capacity) {
			students[count] = student;
			count++;
		} else {
			System.out.println("Database is full! Cannot add more students.");
		}
	}
	
	public Student getStudent(int index) {
		if(index >= 0 && index < count) {
			return students[index];
		}
		return null;
	}
	
	public int getStudentCount() {
		return count;
	}
	
	public void displayAllStudents() {
		System.out.println("Your Report Card");
		for(int i = 0; i < count; i++) {
			System.out.println("Student Name: " + students[i].studentName);
			for(int j = 0; j < students[i].subjectName.length; j++) {
				System.out.println(students[i].subjectName[j] + " " + students[i].marks[j] + " (Grade: " + students[i].grade[j] + ")");
			}
			System.out.println("Final Grade: " + students[i].finalGrade);
			System.out.println();
		}
	}
}

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
	
	



public class reportCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of Student: ");
		int noOfStudent = sc.nextInt();
		sc.nextLine(); 
		
		StudentDatabase database = new StudentDatabase(noOfStudent);
		
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
			database.addStudent(student);
			}
		
		database.displayAllStudents();
		
		sc.close();
	}

}
