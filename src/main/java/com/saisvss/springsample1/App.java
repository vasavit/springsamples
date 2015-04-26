package com.saisvss.springsample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
    	
    	HelloWorld hw = (HelloWorld) context.getBean("helloBeanProxy");
    	hw.printHello();
  System.out.println("--------------"); 
HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean1");
		
		obj.printHello();
		obj1.printHello();
		HelloWorld hw1 = (HelloWorld) context.getBean("helloBean1Proxy");
    	hw1.printHello();
  System.out.println("--------------"); 
	}
}
