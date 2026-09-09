package com.student.AddStudent;

import java.util.Scanner;

import com.student.Service;
import com.student.Student;


public class AddStudent {

	static Scanner sc=new Scanner(System.in);
	public static void addStudent() {
		
		if(Service.count==Service.students.length) {
			System.out.println("cant add students...limit reached");
			return;
		}
		System.out.println("enter the student details");
		System.out.println("enetr the id");
		int id=sc.nextInt();
		
		// check the duplicate
		if(Service.count>0) {
		for(int i=0;i<Service.count;i++) {
			if(Service.students[i].getStudentId()==id) {
				System.out.println("id is already present....enter another one..");
				return ;
			}
		}
		}
		
		
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the age");
		int age=sc.nextInt();
		s
		System.out.println("enter thr course");
		String course=sc.next();
		
		System.out.println("enter the dept");
		String dept=sc.next();
		
		Student s1=new Student(id,name,age,course,dept);
		Service.students[Service.count]=s1;
		Service.count++;
		System.out.println("student details successfully added");
		
	}
}
