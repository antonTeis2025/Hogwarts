package org.example;

import org.example.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creamos la configuracion
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Person.class);

        // pasa de configuracion a SessionFactory para poder establecer las conexiones
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            // crea la sesion a partir de session factory
            Session session = sessionFactory.openSession();
        }

    }
}