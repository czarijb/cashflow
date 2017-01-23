package com.github.czarijb.daoImpl;

import com.github.czarijb.model.Expenses;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by aleksandr on 21.01.17.
 */
public class ExpensesDAOImpl {

    private Session session;

    public ExpensesDAOImpl(Session session){
        this.session = session;
    }

    public void addExpenses(Expenses expenses) {

        try {
            session.beginTransaction();
            session.save(expenses);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteExpenses(Expenses expenses) {

        try {
            session.beginTransaction();
            session.delete(expenses);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public Expenses getExpenses(long id) {

        Expenses result = null;

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Expenses.class);
            result = (Expenses) criteria.uniqueResult();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<Expenses> getAllExpenses() {

        List<Expenses> expensesList = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Expenses.class);
            expensesList = criteria.list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }

        return expensesList;
    }
}
