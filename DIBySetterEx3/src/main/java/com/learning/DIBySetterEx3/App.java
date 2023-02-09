package com.learning.DIBySetterEx3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ConfigFile.xml");
       Institute in = (Institute)context.getBean("institute");
       in.display();
    }
}
