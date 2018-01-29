import java.util.ArrayList;

public class MyMvcDemo {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor("Thomas", "Marlowe", "marlowth@shu.edu", 9724300);
		
		Professor professor2 = new Professor("Garett", "Chang", "garett.chang@shu.edu", 9724304);
		
		Course course1 = new Course("Software Engineering I", "CSAS3111A", 3, professor1);
		
		Course course2 = new Course("Software Engineering II", "CSAS3112A", 3, professor2);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		courses.add(course1);
		
		Student student = new Student("Garrett", "Denton", "dentonga@shu.edu", 11221172, courses);
		
		StudentView studentView1 = new StudentView();
		StudentController sController1 = new StudentController(student, studentView1);
		
		sController1.printStudentDetails();
		
		student.addCourse(course2);
		
		StudentView studentView2 = new StudentView();
		StudentController sController2 = new StudentController(student, studentView2);
		
		sController2.printStudentDetails();
		
		
	}
	
}
