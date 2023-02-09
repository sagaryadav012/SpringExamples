package com.telusko.DIByConstructorEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile.xml");
       Employee emp = (Employee) context.getBean("emp");
       System.out.println(emp);
    }
}
