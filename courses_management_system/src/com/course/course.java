package com.course;

public class course {
	int courseId;
	String courseName;
	String duration;
	public course(int courseId,String courseName,String duration) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.duration=duration;
	}
	public int getCourseId() {
		return this.courseId;
	}
	public String getCourseName() {
		return this.courseName;
	}
	public String getDuration() {
		return this.duration;
	}
	public void setcourseId(int courseId) {
		this.courseId=courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setDuration(String duration) {
		this.duration=duration;
	}
	public void displayDetails() {
		System.out.println("CourseID : "+courseId);
		System.out.println("CourseName : "+courseName);
		System.out.println("Duration : "+duration);
	}

}