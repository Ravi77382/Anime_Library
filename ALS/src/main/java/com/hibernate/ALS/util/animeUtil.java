package com.hibernate.ALS.util;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.hibernate.ALS.model.library;
public class animeUtil
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			try
			{
				Configuration configuration = new Configuration();
				Properties setting = new Properties();
				setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				setting.put(Environment.URL, "jdbc:mysql://localhost:3306/Anime_Library?useSSL=false");
				setting.put(Environment.USER,"root");
				setting.put(Environment.PASS,"Ravi1432");
				setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
				setting.put(Environment.SHOW_SQL,"true");
				setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
				setting.put(Environment.HBM2DDL_AUTO,"create-drop");
				configuration.setProperties(setting);
				configuration.addAnnotatedClass(library.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
						applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return sessionFactory;
	}
}