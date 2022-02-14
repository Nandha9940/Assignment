package com.hibernate.project.HibernateFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.project.Entity.Song;

public class ReadApp {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("configuration.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Song song = session.get(Song.class, 3);
		System.out.println(song);
	}
}
