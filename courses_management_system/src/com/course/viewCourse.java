package com.course;
import java.util.Scanner;
import com.system.Service;
public class viewCourse {
		public static void view() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter courseID : ");
			int courseId=sc.nextInt();
			for(int i=0;i<Service.courseCount;i++) {
				if(Service.courses[i].getCourseId()==courseId) {
					Service.courses[i].displayDetails();
				}
			}
		}

	}