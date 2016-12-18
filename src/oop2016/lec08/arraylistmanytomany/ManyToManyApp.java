package oop2016.lec08.arraylistmanytomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyToManyApp {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>(Arrays.asList(
				new Student("金家"), new Student("道木"), new Student("成瀬")));
		
		List<Course> courses = new ArrayList<>(Arrays.asList(
				new Course("オブジェクト指向プログラミング"), new Course("プログラミングスキル")));
		
		combine(students.get(0), courses.get(0));
		combine(students.get(0), courses.get(1));
		combine(students.get(1), courses.get(1));
		combine(students.get(2), courses.get(0));
		combine(students.get(2), courses.get(1));
		
		for(int i=0; i<students.size(); i++){
			students.get(i).printCourses();
		}
		
		for(int i=0; i<courses.size(); i++){
			courses.get(i).printStudents();
		}
		
	}
	
	public static void combine(Student student, Course course){
		student.courses.add(course);
		course.students.add(student);
	}
	
}
