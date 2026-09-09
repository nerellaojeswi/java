package com.students;
import java.util.Scanner;
import com.system.Service;
import com.students.student;
public class AddStudent {
		public static void addStudents() {
			if(Service.studentCount==Service.students.length) {
				System.out.println("Cannot add students limit is reached");
				return;
			}
			System.out.println("*****----Enter the student details: ----*****");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id : ");
			int id =sc.nextInt();
			if(Service.studentCount>0) {
			for(int i=0;i<Service.studentCount;i++) {
				if(Service.students[i].getStudentId()==id) {
					System.out.println("The Id is already exist try with another Id : ");
					return;
				}
			}
		}
			System.out.println("Enter the name : ");
			String name=sc.next();
			System.out.println("Enter the age : ");
			int age=sc.nextInt();
			System.out.println("Enter the course : ");
			String course=sc.next();
			System.out.println("Enter the department : ");
			String dept=sc.next();
			student st=new student(id,name,age,course,dept);
			Service.students[Service.studentCount] = st;
	        Service.studentCount++;
	        System.out.println("Student added successfully");
	        System.out.println("-----------------------------");
			
	}

}
