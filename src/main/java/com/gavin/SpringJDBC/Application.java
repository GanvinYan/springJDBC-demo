package com.gavin.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gavin.SpringJDBC.dao.Impl.StudentJDBCTemplate;

/**
 * Hello world!
 *
 */
public class Application 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       
       StudentJDBCTemplate studentJDBCTemplate =(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
       studentJDBCTemplate.create("Zara", 11);
    	
    	
    	
//    	System.out.println( "Hello World!" );
    }
}
