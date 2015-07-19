/**
 * 
 */
package com.poc.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.poc.data.FellowEmployee;

/**
 * @author MaRoy
 *
 */
public class SpringHibernateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("config/applicationContext.xml");
		FellowEmployee fe = (FellowEmployee)context.getBean("fellowEmployee");
		fe.getVehicle().run();

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
				applySettings(configuration.getProperties());
		SessionFactory sf = configuration.buildSessionFactory(builder.build());
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.persist(fe);

		tx.commit();

		session.close();

		System.out.println("Successfully Saved!!");
	}

}
