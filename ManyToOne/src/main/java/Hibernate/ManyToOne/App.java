package Hibernate.ManyToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("Configuration.cfg.xml");

		configuration.addAnnotatedClass(Laptop2.class);
		configuration.addAnnotatedClass(Student2.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		

		Laptop2 lap = new Laptop2();
		lap.setIdlap(100);
		lap.setModel("Apple");
		
		
		Student2 stud = new Student2();
		stud.setStid(1);
		stud.setStname("Arun");
		stud.setMarks(99);
		stud.getLaptop().add(lap);
		
		session.beginTransaction();
		session.save(lap);
		session.save(stud);
		session.getTransaction().commit();
	}
}
