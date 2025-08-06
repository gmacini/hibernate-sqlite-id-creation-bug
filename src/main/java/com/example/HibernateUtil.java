package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(NotWorkingWithBothFieldsIntegerAndIdAlphabeticallySecondEntity.class)
                    .addAnnotatedClass(NotWorkingWithIdNotIntegerAndAnotherColumnAsIntegerAndIdAlphabeticallyFirstEntity.class)
                    .addAnnotatedClass(WorkingOnlyIdAsIntegerAndIdAlphabeticallySecondEntity.class)
                    .addAnnotatedClass(WorkingWithBothFieldsIntegerAndIdAlphabeticallyFirstEntity.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}