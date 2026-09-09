package com.student.UpdateStudent;

import java.util.Scanner;

import com.student.Service;

public class UpdateStudent {
   public static void updatestudent() {
	   System.out.println("enter the id to update");
	   Scanner sc=new Scanner(System.in);
	   int id=sc.nextInt();
	 int  index=-1;
	   for(int i=0;i<Service.count;i++) {
		   if(Service.students[i].getStudentId()==id) {
			   index=i;
			   System.out.println("enter the updated id");
			   int ids=sc.nextInt();
			   Service.students[i].setStudentId(ids);
			   
			   
			   System.out.println("enter the updated name");
			   String name=sc.next();
			   Service.students[i].setStudentName(name);
			   
			   System.out.println("enter the updated age");
			   int age=sc.nextInt();
			   Service.students[i].setStudentAge(age);
			   
			   System.out.println("enter the updated course");
			   String course=sc.next();
			   Service.students[i].setStudentCourse(course);
			   
			   
			   System.out.println("enter the updated dept");
			   int dept=sc.nextInt();
			   Service.students[i].setStudentDept(dept);
			   
			   System.out.println("updated values");
			   Service.students[ids].displayDetails();
		   }
	   }
   }
}
