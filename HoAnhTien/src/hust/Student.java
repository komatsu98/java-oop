package hust;


public class Student extends HustPerson{
	private String major = "CNTT";
	private String program = "KSTN";
	//constructor
	public Student(String fullName, String studentId, String major, String program) {
		super(fullName, studentId);
		this.major = major;
		this.program = program;
	}		
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
	public static void printAStudent(Student student) {
		System.out.println("Họ tên: " + student.getFullName() + " - " + "MSSV: " + student.getNumberId());
		System.out.println("  Major: " + student.getMajor() + " - " + "Program: " + student.getProgram() + " \n");
	}
	
	public static void printAStudent(Student student, int i) {
		System.out.print(i+".");
		Student.printAStudent(student);
	}
	
	
}
