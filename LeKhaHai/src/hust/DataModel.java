package hust;

import java.util.ArrayList;
import java.util.List;


public class DataModel {
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Class> classes = new ArrayList<Class>();
	
	
	//constructor
	public List<Student> getStudents() {
		if(students.isEmpty()) {
			students.add(new Student("Lê Khả Hải","20164835","CNTT", "KSTN"));
			students.add(new Student("Lê Đức Dũng", "20160656", "CNTT", "KSTN"));
			students.add(new Student("Nguyễn Như Hoàng", "20164800", "CNTT", "KSTN"));
			students.add(new Student("Lê Công Thành", "20164836", "CNTT", "KSTN"));
			students.add(new Student("Nguyễn Tiến Tài", "20164834", "CNTT", "KSTN"));
		}
		return students;
	}
	public void printStudents() {
		this.getStudents();
		int i = 1;
		for(Student student:this.students) {
			System.out.print(i+". ");
			Student.printStudents(student);
			i++;
		}		
	}
	public void getStudentById(String id) {
		int i = 0;
		for(Student student:this.students) {
			if(student.numberId.equals(id)) {
				Student.printStudents(student);
				i++;
			}	
		}
		if(i==0) System.out.println("Không tìm thấy SV có id: "+ id);
	}
	
	public void addStudent(String name, String id) {
		students.add(new Student(name,id,"CNTT", "KSTN"));
	}
	public void deleteStudentById(String id) {
		int i = 0, j=0;
		for(Student student:this.students) {
			if(student.numberId.equals(id)) {
				students.remove(j);
				i++;
				break;
			} else j++;			
		}
		if(i==0) System.out.println("Không tìm thấy SV có id: "+ id);
		else this.printStudents();
	}	
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	public List<Course> getCourses() {
		if(courses.isEmpty()) {
			courses.add(new Course("IT3001", "Lập trình hướng đối tượng", 2));
			courses.add(new Course("IT3002", "Linux và phần mềm mã nguồn mở", 2));
			courses.add(new Course("IT3003", "Điện tử số", 2));
			courses.add(new Course("IT3004", "Tiếng Anh CNTT", 3));
			courses.add(new Course("IT3005", "Mạng máy tính", 3));
			courses.add(new Course("IT3006", "Cơ sở dữ liệu", 3));
			courses.add(new Course("TD", "Thể chất D", 0));
		}
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public List<Teacher> getTeachers() {
		if (teachers.isEmpty()) {
			teachers.add(new Teacher("Nuyễn Thanh Hùng", "hungnt", "VCNTT&TT"));
			teachers.add(new Teacher("Nguyễn Thị Kim Anh", "anhntk", "VCNTT&TT"));
			teachers.add(new Teacher("Nguyễn Thị Thu Trang", "trangntt", "VCNTT&TT"));
		}
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Class> getClasses() {
		if(classes.isEmpty()) {
			String[] studentIds1 = {"20164835", "20164834", "20164836"};
			classes.add(new Class("Lop1", "IT3001", "hungnt", studentIds1));
		}
		return classes;
	}
public void getClassByStudentId(String id) {
		this.getClasses();
		int x = 0;
		for(Class lop:this.classes) {
			String[] A = lop.getStudentIds();
			for(int i = 0; i< A.length; i++) {
				if(A[i].equals(id)) {
				 System.out.println("\nSinh viên");
				 this.getStudentById(id);
				 System.out.println("Đang học lớp có id: " + lop.getClassId() + " \n");
				x++;
				}
			}
		if( x == 0) 
			{
			this.getStudentById(id);
			System.out.println("\nSinh viên này chưa học lớp nào!\n");
			}
		
		}
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	
}
