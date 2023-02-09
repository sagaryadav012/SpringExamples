package com.learnings.JavaBasedConfigExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements Processor
{

	public void pType() 
	{
	   System.out.println("Processor Snapdragon 8Gen1");	
	}

}
