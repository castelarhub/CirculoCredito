package com.maxcom.mpm.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author operador
 */
public class HibernateUtil {
    
  private static final SessionFactory sessionFactoryOracle = builSessionFactoryOracle();    
    
  private static SessionFactory builSessionFactoryOracle()
  {
    try
    {
      Configuration config = new Configuration();
      config.configure("hibernate.cfg.xml");
      ServiceRegistryBuilder srBuilder = new ServiceRegistryBuilder();
      srBuilder.applySettings(config.getProperties());
      ServiceRegistry serviceRegistry = srBuilder.buildServiceRegistry();
      SessionFactory factory = config.buildSessionFactory(serviceRegistry);

      return factory;
      
    } catch (Throwable ex) {
      System.err.println("No se pudo crear la SessionFactory Oracle." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  
  public static SessionFactory getSessionFactoryOracle(){
    return sessionFactoryOracle;
  }
  
  public static void closeSessionOracle() throws HibernateException {
    if (sessionFactoryOracle != null)
      sessionFactoryOracle.close();
  }
    
}
