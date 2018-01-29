import java.util.ArrayList;

public class Student { 
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<Course> courses;

	public Student(String firstName, String lastName, String email, int idNumber, ArrayList<Course> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.idNumber = idNumber;
		this.courses = courses;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	} 
	
	public void getCourses() {
		for (Course course : courses) {
			CourseView courseView = new CourseView();
			CourseController cController = new CourseController(course, courseView);
			cController.printCourseDetails();
			System.out.println();
		}
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
}
