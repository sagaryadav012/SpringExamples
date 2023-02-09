package com.learnings.AutoWiredDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
   private int id;
   private String name;
   
   @Autowired
   private Address ad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
   
}
