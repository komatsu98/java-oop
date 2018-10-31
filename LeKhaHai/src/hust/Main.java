package hust;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DataModel data = new DataModel();
		int choose=100;
		String studentId, studentName;
		while(choose!=0) {
			System.out.println("\nNhập vào chức năng bạn muốn sử dụng:");
			System.out.println("________________MENU________________\n");
			System.out.println("1. Quản lý sinh viên.");
			System.out.println("2. Quản lý giảng viên.");
			System.out.println("3. Quản lý lớp học");
			System.out.println("4. Quản lý học phần");
			System.out.println("5. Quản lý đồ án");
			System.out.println("6. Sinh viên đăng ký lớp học");
			System.out.println("0. Thoát");
	        System.out.print("\nChọn chức năng: ");
	        Scanner  Input = new Scanner(System.in);
	        choose = Input.nextInt();
	        switch(choose) {
	        case 0: break;
	        case 1:
	        	int chooseInStudent= 0;
	        	 System.out.println("Danh sach sinh vien la:\n");
	        	 data.printStudents();
	        	 
	        	 
	        	 while(chooseInStudent != 5) {
	        		 System.out.println("Chọn các chức năng với quản lý sinh viên");
	            	 System.out.println("1.Tìm kiếm   2.Thêm   3.Xóa   4.D/s lớp SV học   5.Thoát");
	            	 System.out.print("Chon chuc nang: ");
	            	 chooseInStudent = Input.nextInt();
	            	 switch(chooseInStudent) {
	            	 case 1:
	            		 System.out.print("Nhap vao ma so sinh vien: ");
	            		 Input.nextLine();
	            		 studentId = Input.nextLine();
	            		 data.getStudentById(studentId);
	            		 break;
	            	 case 2:
	            		 System.out.print("Nhap vao ten sinh vien: ");
	            		 Input.nextLine();
	            		 studentName = Input.nextLine();
	            		 System.out.print("Nhap vao MSSV: ");
	            		 studentId = Input.nextLine();
	            		 data.addStudent(studentName, studentId);
	            		 data.printStudents();
	            		 break;
	            	 case 3:
	            		 System.out.print("Nhap vao ma so sinh vien: ");
	            		 Input.nextLine();
	            		 studentId = Input.nextLine();
	            		 data.deleteStudentById(studentId);
	            		 break;
	            	 case 4:
	            		 System.out.print("Nhap vao ma so sinh vien: ");
	            		 Input.nextLine();
	            		 studentId = Input.nextLine();
	            		 data.getClassByStudentId(studentId);
	            	 case 5: break;
	            	 }
	        	 }
	        case 2: System.out.println("danh sach giang vien"); break;
	        case 3: System.out.println("danh sach lop"); break;
	        case 4: System.out.println("danh sach hoc phan");break;
	        
	        }
		}
	}
}
