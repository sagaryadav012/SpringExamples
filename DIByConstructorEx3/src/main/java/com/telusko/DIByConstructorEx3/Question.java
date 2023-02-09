package com.telusko.DIByConstructorEx3;

import java.util.List;

public class Question 
{
  private int qid;
  private String name;
  private List<String> answers;
  
   public Question(int qid, String name, List<String> answers)
   {
		super();
		this.qid = qid;
		this.name = name;
		this.answers = answers;
   }
  
   public void show()
   {
	   for(String answer : answers)
	   {
		   System.out.println(answer);
	   }
   }
}
