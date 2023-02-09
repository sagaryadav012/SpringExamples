package com.telusko.SpringDependencyInjectionAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Lenovo implements HardDrive
{
	public void storage()
	   {
		  System.out.println("Storage Capacity : 900 GB");   
	   }
}
