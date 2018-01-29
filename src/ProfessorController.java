
public class ProfessorController {
	private ProfessorView professorView;
	private Professor professor;
	
	public ProfessorController(Professor professor, ProfessorView professorView) {
		this.professor = professor;
		this.professorView = professorView;
	}
	
	public void printProfessorDetails() {
		this.professorView.printProfessorDetails(this.professor);
	}

}
