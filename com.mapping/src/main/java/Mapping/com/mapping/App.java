package Mapping.com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("Configuration.cfg.xml");

		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Laptop.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("dell");
		Student student = new Student();
		student.setRollno(1);
		student.setName("nandha");
		student.setMarks(100);
		student.setLaptop(laptop);
		

		session.beginTransaction();
		session.save(student);
		session.save(laptop);
		session.getTransaction().commit();

	}
}
