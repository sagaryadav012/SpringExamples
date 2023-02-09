package com.telusko.DIByConstructorEx3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile.xml");
        Question q = (Question)context.getBean("question");
        q.show();
    }
}
