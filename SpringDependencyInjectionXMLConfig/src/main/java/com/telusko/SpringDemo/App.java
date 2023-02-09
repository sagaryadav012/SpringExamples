package com.telusko.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
	    //	  Lenovo l = new Lenovo();    // Tightly coupled
	    //    HardDrive obj = new Lenovo();        // loosely coupled
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        HardDrive obj = (HardDrive)context.getBean("HardDrive"); // ApplicationContext gives getBean()
        obj.storage();
    }
}
