package hust;

public class Teacher extends HustPerson {
	private String department;

	public Teacher(String fullName, String teacherId, String department) {
		super(fullName, teacherId);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
