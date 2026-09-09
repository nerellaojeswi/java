package com.students;

import java.util.Scanner;

import com.system.Service;
public class updateStudent {
		public static void updateStudents() {
			Scanner sc=new Scanner(System.in);
			int index=-1;
			for(int i=0;i<Service.studentCount;i++) {
				System.out.println("Enter the id to update");
				int id=sc.nextInt();
				if(Service.students[i].getStudentId()==id) {
					index=i;
				}
				if(index!=-1) {
					System.out.println("Enter new id:");
		            int newId = sc.nextInt();
		            Service.students[index].setStudentId(newId);
					System.out.println("Enter the name ");
					String name=sc.next();
					Service.students[index].setStudentName(name);
					System.out.println("Enter the age");
					int age=sc.nextInt();
					Service.students[index].setStudentAge(age);
					System.out.println("Enter the course");
					String course=sc.next();
					Service.students[index].setStudentCourse(course);
					System.out.println("Enter the department");
					String department=sc.next();
		            Service.students[index].setStudentDept(department);
		            Service.students[index].displayDetails();
		            System.out.println("Student updated successfully.");
			}else {
					System.out.println("record not found");
			}
			
		}

		}
	}