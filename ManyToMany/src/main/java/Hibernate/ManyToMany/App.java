package Hibernate.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("Configuration.cfg.xml");

		configuration.addAnnotatedClass(Laptop3.class);
		configuration.addAnnotatedClass(Student3.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Laptop3 lap = new Laptop3();
		lap.setIdlap(100);
		lap.setModel("Apple");

		Student3 stud = new Student3();
		stud.setStid(1);
		stud.setStname("Arun");
		stud.setMarks(99);
		stud.getLap().add(lap);

		lap.getStudent().add(stud);
		session.beginTransaction();
		session.save(lap);
		session.save(stud);
		session.getTransaction().commit();
	}
}
