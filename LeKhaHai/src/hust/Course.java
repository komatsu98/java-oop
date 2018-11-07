package hust;

public class Course {
	
	private String courseId;
	private String courseName;
	private int credit;
	
	public Course(String courseId, String courseName, int credit) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
	}
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public static void printCourse(Course tc, int i) {
		System.out.println(i + ". Môn học: " + tc.getCourseName());
		System.out.println("Mã số: " + tc.getCourseId());
		System.out.println("Tín chỉ: " + tc.getCredit() + " \n");
	}
	
}
