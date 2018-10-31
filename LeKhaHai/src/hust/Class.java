package hust;

import java.util.List;



public class Class {
	private String classId;
	private String courseId;
	private String teacherId;
	private Teacher teacher;
	private Course course;
	private String[] studentIds;
	private List<Student> students;
	
	public Class(String classId, String courseId, String teacherId, String[] studentIds) {
		this.classId = classId;
		this.courseId = courseId;
		this.teacherId = teacherId;
		this.studentIds = studentIds;
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String[] getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(String[] studentIds) {
		this.studentIds = studentIds;
	}
	
	

}
