package com.student.ViewStudent;

import java.util.Scanner;

import com.student.Service;

public class ViewStudent {

	
	public static void viewstudent() {
		System.out.println("enter the id to view...");
		Scanner sc= new Scanner(System.in);
		int id=sc.nextInt();
		int index=-1;
		for(int i=0;i<Service.count;i++) {
			if(Service.students[i].getStudentId()==id) {
				index=i;
				Service.students[i].displayDetails();
			}
		}
		
	}
}
