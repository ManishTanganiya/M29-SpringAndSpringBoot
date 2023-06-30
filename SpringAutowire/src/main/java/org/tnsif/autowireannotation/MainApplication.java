package org.tnsif.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*program to demonstrate on autoWiring mode*/
//driver class
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("autowire.xml");
		Citizen c=(Citizen) a.getBean("city");
		c.display();
				
	}

}
