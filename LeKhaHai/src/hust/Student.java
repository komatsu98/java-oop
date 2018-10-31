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
	
	public static void printStudents(Student student) {	
		System.out.println("Họ tên: " + student.fullName + 
					 "\n "+ "MSSV: " + student.numberId + 
					 "\n "+ "Major: " + student.getMajor() +
					 "\n "+ "Program: " + student.getProgram() +"\n ") ;
		
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
	
	
}
