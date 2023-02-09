package com.learnings.JavaBasedConfigExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Sony implements Camera
{

	public void camFeatures() 
	{
	   System.out.println("Front cam : 16MP, Back Cam : 50MP, upto 20x zoom");	
	}

}
