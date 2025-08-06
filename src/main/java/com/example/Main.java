package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class Main
{

    public static void main(String[] args) {
        System.out.println("=== Creating database and table ===");

        try {
            HibernateUtil.getSessionFactory();
            System.out.println("Database and table created successfully!");
            System.out.println("Check the file: hibernate-bug-test.db");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
