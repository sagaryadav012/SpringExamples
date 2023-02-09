package com.learnings.JavaBasedConfigExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone p = config.getBean(Phone.class);
        p.specs();
    }
}
