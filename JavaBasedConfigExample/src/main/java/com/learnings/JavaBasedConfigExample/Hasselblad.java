package com.learnings.JavaBasedConfigExample;

import org.springframework.stereotype.Component;

@Component
public class Hasselblad implements Camera 
{
	public void camFeatures() 
	{
		System.out.println("Front cam : 12MP, Back Cam : 50MP, upto 10x zoom");
	}

}
