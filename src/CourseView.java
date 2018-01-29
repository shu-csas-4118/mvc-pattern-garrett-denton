
public class CourseView {
	private Course course;
	
	public CourseView(Course course) {
		this.course = course;
	}
	
	public CourseView() {
		
	}
	
	public void printCourseDetails(Course course) {
		this.course = course;
		printCourseDetails();
	}
	
	public void setCourseDetails(Course course) {
		
	}
	
	public void printCourseDetails() {
		if(this.course == null) throw new IllegalArgumentException("course");
		
		System.out.println("Course name is " + this.course.getCourseName());
		System.out.println("Course number is " + this.course.getCourseName());
		System.out.println("Course credit worth is " + this.course.getCredits());
		System.out.println("Course professor information: ");
		System.out.println();
		this.course.getProfessor();
	}

}
