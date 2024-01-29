package basicAnnot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ...args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("basicAnnotConfig.xml");
		Address adrs = context.getBean("address", Address.class);
		System.out.println(adrs);
		
		Student s = context.getBean("student", Student.class);
		System.out.println(s);
	}

}
