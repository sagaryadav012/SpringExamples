package com.telusko.SpringDependencyInjectionAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile.xml");
        HardDrive obj = (HardDrive)context.getBean("lenovo"); // ApplicationContext gives getBean()
        obj.storage();
    }
}
