package hust;


public class Class {
	private String classId;
	private String courseId;
	private String teacherId;
	
	public Class(String classId, String courseId, String teacherId) {
		this.classId = classId;
		this.courseId = courseId;
		this.teacherId = teacherId;
	
	}
	
	public String getClassId() {
		return classId;
	}
	
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getTeacherId() {
		return teacherId;
	}
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
}
