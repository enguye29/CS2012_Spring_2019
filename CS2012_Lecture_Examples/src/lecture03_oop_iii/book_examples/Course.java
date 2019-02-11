package lecture03_oop_iii.book_examples;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		this.students[this.numberOfStudents] = student;
		this.numberOfStudents++;
	}

	public String[] getStudents() {
		return this.students;
	}

	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}  

	public String getCourseName() {
		return this.courseName;
	}  

	public void dropStudent(String student) {
		// Left as an exercise in Exercise 10.9
	}
}