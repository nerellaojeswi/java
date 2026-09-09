package com.students;

import java.util.Scanner;
import com.system.Service;
public class viewStudent {
		public static void viewStudents() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int id=sc.nextInt();
			int index=-1;
			for(int i=0;i<Service.studentCount;i++) {
				if(Service.students[i].getStudentId()==id) {
					index=i;
					Service.students[i].displayDetails();
				}
			}
			
		}

	}