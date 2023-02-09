package com.learnings.JavaBasedConfigExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phone
{
	   @Autowired
	   @Qualifier("snapdragon")
	   Processor p;
	   
	   @Autowired
	   @Qualifier("hasselblad")
	   Camera cam;
	   
	   
	   public void specs()
	   {
		   System.out.println("Phone : Samsung");
		   p.pType();
		   cam.camFeatures();
	   }
}
