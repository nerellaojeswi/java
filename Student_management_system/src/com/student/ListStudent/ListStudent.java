package com.student.ListStudent;

import com.student.Service;
import com.student.Student;

public class ListStudent {
	public void ListStudent() {
		if(Service.count==0) {
			System.out.println("no students in list.Add students to see");
			return;
		}
		System.out.println("list of students....");
		for(int i=0;i<Service.count;i++) {
			Student stu=Service.students[i];
			stu.displayDetails();
		}
		
	}

}
