package com.example.assignment.dao;

import com.example.assignment.model.Product;
import com.example.assignment.utl.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {

    @SuppressWarnings("unchecked")
    public List<Product> getAllProducts() {

        Transaction transaction = null;
        List < Product > listOfProducts = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            listOfProducts = session.createQuery("from Product ").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfProducts;
    }

}
