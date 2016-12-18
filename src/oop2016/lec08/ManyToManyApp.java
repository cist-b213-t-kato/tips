package oop2016.lec08;

public class ManyToManyApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		students[0] = new Student("金家"); 
		students[1] = new Student("道木");
		students[2] = new Student("成瀬");
		
		Course[] courses = new Course[2];
		courses[0] = new Course("オブジェクト指向プログラミング");
		courses[1] = new Course("プログラミングスキル");
		
//		students[0].courses = new Course[2];
//		students[0].courses[0] = courses[0];
//		students[0].courses[1] = courses[1];
		
		combine(students[0], courses[0]);
		combine(students[0], courses[1]);
		combine(students[1], courses[1]);
		combine(students[2], courses[0]);
		combine(students[2], courses[1]);
		
		for(int i=0; i<students.length; i++){
			students[i].printCourses();
		}
		
		for(int i=0; i<courses.length; i++){
			courses[i].printStudents();
		}
		
	}
	
	public static void combine(Student student, Course course){
		student.addCourse(course);
		course.addStudent(student);
	}
	
}
