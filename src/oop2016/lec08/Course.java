package oop2016.lec08;

public class Course {
	String courseName;
	Student[] students;
	int nStudent;
	
	Course(String courseName){
		this.courseName = courseName;
		students = new Student[10];
		nStudent = 0;
	}
	
	void addStudent(Student student){
		students[nStudent] = student;
		nStudent++;
	}

	void printStudents(){
		String message = courseName + "は ";
		for(int i=0; i<nStudent; i++){
			Student student = students[i];
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
