package hust;

public class RegisterClass {
	private String classId;
	private String studentId;
	
	public RegisterClass(String classId, String studentId) {
		this.classId = classId;
		this.studentId = studentId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
