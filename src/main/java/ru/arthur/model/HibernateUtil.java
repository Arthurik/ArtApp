package ru.arthur.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import ru.arthur.entities.Article;
import ru.arthur.entities.User;

/**
 * Created by salimhanov on 11.07.2014.
 */
public class HibernateUtil {
    public static SessionFactory sessionFactory;

    static {

        try {
            AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(User.class).addAnnotatedClass(Article.class);
            sessionFactory = ac.configure().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
