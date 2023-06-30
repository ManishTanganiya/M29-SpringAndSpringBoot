package org.tnsif.literals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tnsif.objects.Student;
public class DIUsingLiteralsExecutor {

	public static void main(String[] args) {
		/*ApplicationContext a=new ClassPathXmlApplicationContext("literals.xml");
		Employee e=(Employee) a.getBean("e1");
		e.print();*/
		ApplicationContext a=new ClassPathXmlApplicationContext("objects.xml");
		Student s=(Student) a.getBean("s1");
		s.print();

	}

}
