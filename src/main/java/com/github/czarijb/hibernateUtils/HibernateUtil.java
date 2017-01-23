package com.github.czarijb.hibernateUtils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by aleksandr on 21.01.17.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
