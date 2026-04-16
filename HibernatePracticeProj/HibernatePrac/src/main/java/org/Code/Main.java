package org.Code;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        // Step 1: Create Employee object
        Employee e = new Employee();
        e.setEmpid(107);
        e.setName("john");
        e.setDept("cse");

        // Step 2: Load configuration
        Configuration config = new Configuration().configure();

        // Step 3: Create SessionFactory
        SessionFactory factory = config.buildSessionFactory();

        // Step 4: Open Session
        Session session = factory.openSession();

        // Step 5: Begin Transaction
        Transaction tx = session.beginTransaction();

        // Step 6: Save Employee
        session.persist(e);

        // Step 7: Commit
        tx.commit();

        // Step 8: Close
        session.close();
        factory.close();

        System.out.println("Employee data inserted successfully!");
    }
}