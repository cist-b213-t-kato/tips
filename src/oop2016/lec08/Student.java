package oop2016.lec08;

public class Student {
	String studentName;
	Course[] courses;
	int nCourse;
	
	Student(String studentName){
		this.studentName = studentName;
		courses = new Course[10];
		nCourse = 0;
	}
	
	void addCourse(Course course){
		courses[nCourse] = course;
		nCourse++;
	}
	
	void printCourses(){
		String message = studentName + "は ";
		for(int i=0; i<nCourse; i++){
			Course course = courses[i];
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
