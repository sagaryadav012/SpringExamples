package com.telusko.SpringDependencyInjectionAnnotationConfig;

import org.springframework.stereotype.Component;

@Component // default bean name toshiba
public class Toshiba implements HardDrive
{
   public void storage()
   {
	 System.out.println("Storage Capacity : 1 TB");   
   }
}
