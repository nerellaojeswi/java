package com.student;

import java.util.Scanner;

import com.student.AddStudent.AddStudent;
import com.student.DeleteStudent.DeleteStudent;
import com.student.ListStudent.ListStudent;
import com.student.UpdateStudent.UpdateStudent;
import com.student.ViewStudent.ViewStudent;

public class Main {
	
	public static void welcomemessage() {
		System.out.println("*****----welcome to student management syatem----*****");
		System.out.println(" ");
	}
	public static void options() {
		System.out.println("select any option to perform");
		System.out.println(" ");
		System.out.println("1. list of students");
		System.out.println("2. add students");
		System.out.println("3. Update students");
		System.out.println("4. delete students");
		System.out.println("5. view students");
		System.out.println("6.exit");
	}
	
	public static void selectoptions(Scanner sc) {
		ListStudent ls=new ListStudent();
		boolean isexit=false;
		while(!isexit) {
			int selectedoption=sc.nextInt();
			switch(selectedoption) {
			case 1->{
				System.out.println("list of students");
				ls.ListStudent();
			}
			case 2->{
				System.out.println("add students");
				AddStudent.addStudent();
				
			}
			case 3->{
				System.out.println("update student");
				UpdateStudent.updatestudent();
				
			}
			case 4->{
				System.out.println("delete student");
				DeleteStudent.deletestudent();
				
			}
			case 5->{
				System.out.println("view student");
				ViewStudent.viewstudent() ;
			}
			case 6->{
			    isexit=true;
			}
			 default->{
					System.out.println("invalid opition");
			}
			}
		}
	}
	

	public static void main(String[] args) {
	welcomemessage();
    options();
    Scanner sc=new Scanner(System.in);
    selectoptions(sc);
    
    
    
	}

}

