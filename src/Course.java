
public class Course {
	private String courseName;
	private String courseNumber;
	private int credits;
	private Professor professor;

	public Course(String courseName, String courseNumber, int credits, Professor professor) {
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.professor = professor;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseNumber() {
		return this.courseNumber;
	}

	public void setCourseNumber(String courseNumber){
		this.courseNumber = courseNumber;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	} 
	
	public void getProfessor() {
		ProfessorView professorView = new ProfessorView();
		ProfessorController pController = new ProfessorController(this.professor, professorView);
		pController.printProfessorDetails();
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}

