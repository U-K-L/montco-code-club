/* Contributor: Peter Hanes
 * Purpose: Define Professor objects
 */

public class Professor { // extends other class?
	
	private Question[] myQuestions;
	
	private String name;
	private String discipline;
	private int healthCount;
	private int questionCount;
	private boolean hasNextQuestion;
	
	public Professor() {
		name = "defaultName";
		discipline = "defaultDisc";
		healthCount = 999;
		questionCount = 0;
		hasNextQuestion = false;
	} // Professor() no-arg
	
	public Professor (String name, String discipline) {
		this.name = name;
		this.discipline = discipline;
		healthCount = 100;
		questionCount = 0;
		hasNextQuestion = false;
	} // Professor(name, disc)
	
	public Professor (String name, String discipline, Question[] importQuestions) {
		this.name = name;
		this.discipline = discipline;
		healthCount = 100;
		questionCount = 0;
		createQuestionArray(importQuestions); // Doesn't necessarily need to be created in the constructor
	} // Professor(name, disc, Question[])
	
	public Question[] createQuestionArray(Question[] importQuestions) {
		// or put arrays of questions in their own objects and call them from outside this class

		this.myQuestions = new Question[importQuestions.length];
		
		for (int i = 0; i < myQuestions.length; i++) 
				this.myQuestions[i] = importQuestions[i];
		
		hasNextQuestion = true;		
		
		return myQuestions;
	}

	// Best way to implement calling next question?
	public String printNextQuestion() {
		
		String nextQuestion;
		
		if (questionCount <= myQuestions.length) {
			nextQuestion = myQuestions[questionCount].toString();
			questionCount++;
			
			return nextQuestion;
		
		} else {
			hasNextQuestion = false;
			nextQuestion = "";
			// Call a method to do something if Professor is out of questions?
			return nextQuestion;
		}
	}
	
	public String toString() {
		
		String profString = "Professor: " + name;
		profString += "\nDiscipline: " + discipline;
		profString += "\nCurrent Health: " + healthCount;
		
		return profString;
	}
	
	// if heathCount decrease is based on difficulty
	// (can use a formula of proportions)
	public void decHealth(Question failedQuestion) {
		healthCount -= failedQuestion.getDifficulty();
	}
	
	public void resetCounts() {
		healthCount = 100;
		questionCount = 0;
	}

	public String getName() {
		return name;
	}
	public String getDiscipline() {
		return discipline;
	}
	public int getHealthCount() {
		return healthCount;
	}
	public boolean checkHasNextQuestion() {
		return hasNextQuestion;
	}
}