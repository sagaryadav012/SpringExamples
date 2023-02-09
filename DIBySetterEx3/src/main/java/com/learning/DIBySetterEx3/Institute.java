package com.learning.DIBySetterEx3;

import java.util.List;

public class Institute 
{
  private String name;
  private String area;
  private List<String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public void display()
	{
		for(String course : courses)
			System.out.println(course);
	}
  
}
