package com.system;
import java.util.Scanner;
import com.students.AddStudent;
import com.students.updateStudent;
import com.students.viewStudent;
import com.course.addCourse;
import com.course.updateCourse;
import com.course.viewCourse;

public class Main {
    public static void welcomeMessage() {
        System.err.println("*****----Welcome to Course Management System----*****");
        System.out.println(" ");
    }

    public static void options() {
        System.out.println("Select any option to perform:");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. View Students");
        System.out.println("4. Add Course");
        System.out.println("5. Update Course");
        System.out.println("6. View Courses");
        System.out.println("7. Exit");
    }

    public static void selectOptions(Scanner sc) {
        boolean isExit = false;
        while (!isExit) {
            int selectOption = sc.nextInt();
            switch (selectOption) {
                case 1 -> AddStudent.addStudents();
                case 2 -> updateStudent.updateStudents();
                case 3 -> viewStudent.viewStudents();
                case 4 -> addCourse.addCourse();
                case 5 -> updateCourse.updateCourse();
                case 6 -> viewCourse.view();
                case 7 -> isExit = true;
                default -> System.out.println("Invalid option");
            }
        }
    }
    public static  void main(String[] args) {
    	welcomeMessage();
    	options();
    	System.out.println("Select from the options");
    	Scanner sc=new Scanner(System.in);
    	selectOptions(sc);
    	
    }
    	
    }
