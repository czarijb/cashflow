package com.github.czarijb.daoImpl;

import com.github.czarijb.model.Income;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by aleksandr on 21.01.17.
 */
public class IncomeDAOImpl {

    private Session session;

    public IncomeDAOImpl(Session session){
        this.session = session;
    }

    public void addIncome(Income income) {

        try {
            session.beginTransaction();
            session.save(income);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteIncome(Income income) {

        try {
            session.beginTransaction();
            session.delete(income);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public Income getIncome(long id) {

        Income result = null;

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Income.class);
            result = (Income) criteria.uniqueResult();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<Income> getAllIncome() {

        List<Income> incomeList = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Income.class);
            incomeList = criteria.list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return incomeList;
    }
}
