package com.learnings.AutoWiredDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile.xml");
        Student s = (Student)context.getBean("student");
        System.out.println(s);
    }
}
