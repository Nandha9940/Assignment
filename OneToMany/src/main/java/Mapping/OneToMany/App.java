package Mapping.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {Configuration configuration = new Configuration();
	configuration.configure("Configuration.cfg.xml");

	configuration.addAnnotatedClass(Lap.class);
	configuration.addAnnotatedClass(Stud.class);

	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();

	Lap lap=new Lap();
	lap.setIdlap(100);
	lap.setModel("Apple");
	
	Stud stud=new Stud();
	stud.setStid(1);
	stud.setStname("Arun");
	stud.setMarks(99);
	stud.getLap().add(lap);
	
	session.beginTransaction();
	session.save(lap);
	session.save(stud);
	session.getTransaction().commit();
	
    }
}
