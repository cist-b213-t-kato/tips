package oop2016.lec08.arraylistmanytomany;

import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	List<Student> students;
	
	Course(String courseName){
		this.courseName = courseName;
		students = new ArrayList<>();
	}
	
	void printStudents(){
		String message = courseName + "は ";
		for(int i=0; i<students.size(); i++){
			Student student = students.get(i);
			if(student!=null){
				if(i!=0){
					message += " ";
				}
				message += student.studentName;
			}
		}
		message += " に受講されています";
		System.out.println(message);
	}
	
}
