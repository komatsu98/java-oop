package hust;

import java.util.ArrayList;
import java.util.List;


public class DataModel {
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Teacher> teachers = new ArrayList<Teacher>();
	private List<Class> classes = new ArrayList<Class>();
	private List<RegisterClass> registerClasses = new ArrayList<RegisterClass>();
	
	
	//constructor
	public void creatData() {
		this.getClasses();
		this.getCourses();
		this.getTeachers();
		this.getStudents();
		this.getRegisterClasses();
	}
	
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
	
	
	
	public List<RegisterClass> getRegisterClasses() {
		if(registerClasses.isEmpty()) {
			registerClasses.add(new RegisterClass("20181","20164835"));
			registerClasses.add(new RegisterClass("20181","20160656"));
			registerClasses.add(new RegisterClass("20181","20164800"));
			registerClasses.add(new RegisterClass("20181","20164836"));
			registerClasses.add(new RegisterClass("20181","20164834"));
			
			registerClasses.add(new RegisterClass("20182","20164835"));
			registerClasses.add(new RegisterClass("20182","20164836"));
			registerClasses.add(new RegisterClass("20182","20164834"));
			
			registerClasses.add(new RegisterClass("20183","20160656"));
			registerClasses.add(new RegisterClass("20183","20164800"));
		}
		return registerClasses;
	}


	public void printStudents() {
		
		int i = 1;
		for(Student student: students) {
			Student.printAStudent(student, i);
			i++;
		}
	}
	public void addStudent(String name, String id) {
		students.add(new Student( name, id, "CNTT", "KSTN"));
	}
	public void deleteStudentById(String id) {
		int i = 0, j = 0, h = 0, m = 0;
		for(Student hs: students) {
			if(hs.getNumberId().equals(id)) {
				students.remove(j);
				i++;
				break;
			}
			else j++;
		}
		if(i==0) System.out.println("Không tìm thấy sinh viên có id: " + id + " \n");
		else {
			this.printStudents();
			for(RegisterClass rc: registerClasses) {
				if(rc.getStudentId().equals(id)) h++;
			}
			if(h!=0) 
				for (int x = 0; x < h; x++) {
					m = 0;
					for(RegisterClass rc: registerClasses) {
						
						if(rc.getStudentId().equals(id)) {
							registerClasses.remove(m); 
							break;					
						}
						m++;
					
					}	
				}
				
		}
	}
	public void addRegisterClass(String classId, String studentId) {
		int i = 0;
		for(RegisterClass rc: registerClasses) {
			if(rc.getStudentId().equals(studentId) && rc.getClassId().equals(classId)) 
				i++;
			}
		if(i!=0)
			System.out.println("\n Đăng ký Thất bại - Bạn đã đăng ký lớp này!! \nNhấn phím bất kỳ để thoát \n" );
		else
			System.out.println("\n Đăng ký Thành công, nhấn phím bất kỳ để thoát \n");
	}
	
	
	
	public Student getStudentById(String id) {
		Student hs1 = null;
		for(Student hs: students) {
			if(hs.getNumberId().equals(id)) {
				hs1 = hs;
			}
		}
		return hs1;		
	}
	public void printStudentById(String id) {		
		if(this.getStudentById(id)==null) System.out.println("Không tìm thấy sinh viên có id: " + id + " \n");
		else Student.printAStudent(this.getStudentById(id));
	}
	public void getClassByStudentId(String id) {
		this.printStudentById(id);
		System.out.println("Danh sách lớp sinh viên đang học là: \n");
		int i = 1;
		for(RegisterClass rc: registerClasses) {
			if(rc.getStudentId().equals(id)) {
				this.printAClass(this.getClassById(rc.getClassId()), i);
				i++;				
			}
		}
	}
	
	public void getStudentsByClassId(String id) {
		System.out.println("Danh sách sinh viên đang học là: \n");
		int i = 1;
		for(RegisterClass rc: registerClasses) {
			if(rc.getClassId().equals(id)) {
				System.out.println(i + ". " + this.getStudentById(rc.getStudentId()).getFullName());
				i++;				
			}
		}
	}
	
	
	public List<Course> getCourses() {
		if(courses.isEmpty()) {
			courses.add(new Course("IT3001","Cơ sỡ dữ liệu", 3));
			courses.add(new Course("IT3002","Tiếng Anh CNTT & TT", 3));
			courses.add(new Course("IT3003","Mạng máy tính", 3));
			courses.add(new Course("IT3004","Điện tử số", 2));
			courses.add(new Course("IT3005","Lập trình hướng đối tượng", 2));
			courses.add(new Course("IT3006","Linux là phần mềm mã nguồn mở", 3));
			courses.add(new Course("TC2","Bóng chuyền 2", 0));
		}
		return courses;
	}
	public Course getCourseById(String id) {
		Course hs1 = null;
		for(Course hs: courses) {
			if(hs.getCourseId().equals(id)) {
				hs1 = hs;
			}
		}
		return hs1;		
	}
	public void printCourse() {
		int i=0;
		for(Course tc: courses) {
			Course.printCourse(tc, i);
			i++;
		}
	}
	
	
	
	public List<Teacher> getTeachers() {
		if(teachers.isEmpty()) {
			teachers.add(new Teacher("Nguyễn Thanh Hùng", "hungnt","Viện CNTT & TT"));
			teachers.add(new Teacher("Nguyễn Thị Thu Trang", "trangntt","Viện CNTT & TT"));
			teachers.add(new Teacher("Nguyễn Thị Thanh Nga", "ngantt","Viện CNTT & TT"));
			teachers.add(new Teacher("Trương Thị Diệu Linh", "linhttd","Viện CNTT & TT"));
			teachers.add(new Teacher("Nguyễn Kim Anh", "anhnk","Viện CNTT & TT"));
			teachers.add(new Teacher("Đàm Thanh Sơn", "sondt","Viện CNTT & TT"));
			teachers.add(new Teacher("I Can Do It", "icdi","Bộ môn thể chất"));
		}
		return teachers;
	}
	public Teacher getTeacherById(String id) {
		Teacher hs1 = null;
		for(Teacher hs: teachers) {
			if(hs.getNumberId().equals(id)) {
				hs1 = hs;
			}
		}
		return hs1;		
	}
	public void printTeachers() {
		int i = 1;
		for(Teacher tc:teachers) {
			Teacher.printTeacher(tc, i);
			i++;
		}
	}
	

	public List<Class> getClasses() {
		if(classes.isEmpty()) {
			classes.add(new Class("20181", "IT3005", "hungnt"));
			classes.add(new Class("20182", "IT3002", "trangntt"));
			classes.add(new Class("20183", "IT3006", "linhttd"));		
		}
		return classes;
	}
	public Class getClassById(String id) {
		Class hs1 = null;
		for(Class hs: classes) {
			if(hs.getClassId().equals(id)) {
				hs1 = hs;
			}
		}
		return hs1;		
	}
	public void printAClass(Class lop, int i) {
		System.out.println(i + ". Lớp: " + this.getCourseById(lop.getCourseId()).getCourseName());
		System.out.println("Mã Lớp: " + lop.getClassId());
		System.out.println("Giảng viên: " + this.getTeacherById(lop.getTeacherId()).getFullName() + " \n");
	}
	public void printClasses() {
		int i = 1;
		for(Class lop: classes) {
			this.printAClass(lop, i);
			i++;
		}
	}
}
