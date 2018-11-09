package hust;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DataModel data = new DataModel();
		data.creatData();
		int choose=100;
		String studentId, studentName, classId = "";
		while(choose!=0) {
			System.out.println("\nNhập vào chức năng bạn muốn sử dụng:");
			System.out.println("________________MENU________________\n");
			System.out.println("1. Quản lý sinh viên.");
			System.out.println("2. Quản lý giảng viên.");
			System.out.println("3. Quản lý học phần");
			System.out.println("4. Quản lý lớp học");
			System.out.println("5. Quản lý đồ án");
			System.out.println("6. Sinh viên đăng ký lớp học");
			System.out.println("0. Thoát");
	        System.out.print("\nChọn chức năng: ");
	        Scanner  Input = new Scanner(System.in);
	        choose = Input.nextInt();
	        switch(choose) {
	        case 0: break;
	        case 1:
	        	 System.out.println("Danh sách sinh viên là:\n");
	        	 data.printStudents();
	        	 int chooseStudentTab=100;
	        	 while(chooseStudentTab!=0) {
	        		 System.out.println("Bạn muốn?\n0.Thoát  1.Thêm  2.Xóa  3.Tìm Kiếm  4.Ds Lớp SV Học");
	        		 System.out.print("Chọn chức năng: ");
	        		 chooseStudentTab = Input.nextInt();
	        		 switch(chooseStudentTab) {
	        		 case 0: break;
	        		 case 1: 
	        			 System.out.print("\nNhập vào tên SV: ");
	        			 Input.nextLine(); studentName = Input.nextLine();
	        			 System.out.print("Nhập vào MSSV: ");
	        			 studentId = Input.nextLine();
	        			 data.addStudent(studentName, studentId);
	        			 data.printStudents();
	        			 break;
	        		 case 2: 
	        			 System.out.print("\nNhập vào MSSV: ");
	        			 Input.nextLine();
	        			 studentId = Input.nextLine();
	        			 data.deleteStudentById(studentId);
	        			 break;
	        		 case 3:
	        			 System.out.print("\nNhập vào MSSV: ");
	        			 Input.nextLine();
	        			 studentId = Input.nextLine();
	        			 data.printStudentById(studentId);
	        			 break;
	        		 case 4:
	        			 System.out.print("\nNhập vào MSSV: ");
	        			 Input.nextLine();
	        			 studentId = Input.nextLine();
	        			 data.getClassByStudentId(studentId);
	        			 break;
	        		 }	        		
	        	 }
	        	 break;
	        case 2: 
	        	System.out.println("Danh sách giảng viên là:\n"); 
	        	data.printTeachers();
	        	break;
	        case 3: 
	        	System.out.println("Danh sách học phần là:\n"); 
	        	data.printCourse();
	        	break;
	        case 4: 
	        	System.out.println("Danh sách lớp học là: \n");
	        	data.printClasses();
	        	int chooseClassTab=100;
	        	 while(chooseClassTab!=0) {
	        		 System.out.println("Bạn muốn?\n0.Thoát  1.Danh sách sinh viên");
	        		 System.out.print("Chọn chức năng: ");
	        		 chooseClassTab = Input.nextInt();
	        		 switch(chooseClassTab) {
	        		 case 0: break;
	        		 case 1:
	        			 classId = "";
	        			 Input.nextLine();
	        			 while(data.getClassById(classId)==null) {
	        				 System.out.print("\nNhập vào Mã lớp: ");		        			 
		        			 classId = Input.nextLine();		        			 
	        			 }
	        			 data.printAClass(data.getClassById(classId), 1);	
	        			 data.getStudentsByClassId(classId);
	        			 break;
	        		 }
	        	 }
	        	break;
	        case 5: System.out.println("Danh sách đồ án là: \n");break;
	        case 6: 
	        	studentId = "";
	        	classId = "";
	        	Input.nextLine();
   			 	while(data.getStudentById(studentId)== null) {
   			 		System.out.print("\nNhập vào MSSV: ");   			 	
   			 		studentId = Input.nextLine();
   			 		data.printStudentById(studentId);
   			 		while(data.getClassById(classId)==null) {
   			 			System.out.print("\nNhập vào Mã Lớp: ");   			 	
   			 			classId = Input.nextLine();
   			 			data.printAClass(data.getClassById(classId), 1);
   			 			if(data.getClassById(classId)!=null) {
   			 				data.addRegisterClass(classId, studentId);
			 				Input.nextLine();
   			 			}
   			 				
   			 		}
   			 	}
	        	break;
	        }
		}
	}
}
