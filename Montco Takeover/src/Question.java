/*
*Contributed by: Andy Malinsky 
*Purpose: The question class 
* 
* 
* 
*/

import java.util.*;


public class Question //extends Professor abstract
{

	private String question;
	private String[] answers;
	private String whatAnswer = "What is the answer?";
	private int difficulty;
	private String major;
	
	
	public Question(String ques, String[] ans, int diff, String maj)
	{
	
		question = ques;
		
		answers = new String[ans.length];
		for (int x = 0; x < ans.length; x++)
		{
			answers[x] = ans[x];
		}
		
		difficulty = diff;
		major = maj;
		
	}
	
	
	
	public String toString()
	{
		String qFormat = "";
		
		qFormat = question +
				"\n" + answers[0] + 
				"\n" + answers[1] +
				"\n" + answers[2] +
				"\n" + answers[3] +
				"\n" + whatAnswer;
		
		return qFormat;
	}
	
	
	
	
}
