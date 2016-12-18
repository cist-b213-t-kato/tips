package oop2016.lec08.arraylistmanytomany;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String studentName;
	List<Course> courses;
	
	Student(String studentName){
		this.studentName = studentName;
		courses = new ArrayList<>();
	}
	
	void printCourses(){
		String message = studentName + "は ";
		for(int i=0; i<courses.size(); i++){
			Course course = courses.get(i);
			if(course!=null){
				if(i!=0){
					message += " ";
				}
				message += course.courseName;
			}
		}
		message += " を受講しています";
		System.out.println(message);
	}
	
	
	
}
