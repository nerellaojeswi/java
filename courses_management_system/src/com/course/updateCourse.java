package com.course;

import java.util.Scanner;
import com.system.Service;
import com.students.student;

public class updateCourse {
    public static void updateCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id to update course:");
        int id = sc.nextInt();
        int index = -1;
        for (int i = 0; i < Service.studentCount; i++) {
            if (Service.students[i].getStudentId() == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Enter new course:");
            String course = sc.next();
            Service.students[index].setStudentCourse(course);
            System.out.println("Course updated successfully.");
            Service.students[index].displayDetails();
        } else {
            System.out.println("Student record not found.");
        }
    }
}
