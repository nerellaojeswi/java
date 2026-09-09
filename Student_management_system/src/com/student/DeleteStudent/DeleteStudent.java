package com.student.DeleteStudent;

import java.util.Scanner;

import com.student.Service;

public class DeleteStudent {
   
	public static void deletestudent() {
		System.out.println("enter the id to delete");
		 Scanner sc =new Scanner(System.in);
		int id=sc.nextInt();
		int index=-1;
		for(int i=0;i<Service.count;i++) {
			if(Service.students[i].getStudentId()==id) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("no record found");
			return;
		}
		for(int i=index;i<Service.count-1;i++) {
			Service.students[i]=Service.students[i+1];
		}
		
		
		Service.students[Service.count-1]=null;
		System.out.println("student deleted successfully....");
	}
	
	
	
	
}
