package com.hibernate.project.HibernateFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.project.Entity.Song;

public class CreateApp {
	public static void main(String[] args) {

		{
			Configuration configuration = new Configuration();
			configuration.configure("configuration.cfg.xml");
			configuration.addAnnotatedClass(Song.class);

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Song song = new Song();
			song.setId(3);
			song.setName("Guru");
			song.setArtist("Prasad");
			session.beginTransaction();
			session.save(song);
			session.getTransaction().commit();
			System.out.println("DATABASE SAVED");
		}
	}
}