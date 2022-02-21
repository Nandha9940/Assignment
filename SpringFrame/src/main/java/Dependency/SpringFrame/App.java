package Dependency.SpringFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car car= (Car)context.getBean("car");
		car.main();
//		Tyre t=(Tyre) context.getBean("tyre");
//		System.out.println(t);
	}
}
