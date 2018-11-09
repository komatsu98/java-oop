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
	
	public static void printTeacher(Teacher tc, int i) {
		System.out.println(i + ". Họ tên giảng viên: " + tc.getFullName());
		System.out.println("Mã số: " + tc.getNumberId());
		System.out.println("Bộ phận: " + tc.getDepartment() + " \n");
	}
}
