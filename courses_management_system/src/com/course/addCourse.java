
package com.course;
import java.util.Scanner;
import com.system.Service;

	public class addCourse {
	    public static void addCourse() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter courseId : ");
	        int courseId = sc.nextInt();
	        System.out.println("Enter courseName : ");
	        String courseName = sc.next();
	        System.out.println("Enter Duration : ");
	        String duration = sc.next();

	        course cse = new course(courseId, courseName, duration);
	        Service.courses[Service.courseCount] = cse;
	        Service.courseCount++;

	        System.out.println("Course added successfully");
	        System.out.println("-----------------------------");
	    }
	}

