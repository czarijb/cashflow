package com.github.czarijb.hibernateUtils;

import com.github.czarijb.daoImpl.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Factory {
    private static Factory ourInstance = new Factory();

    public static Factory getInstance() {
        return ourInstance;
    }

    private Factory() {
    }

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    private AssetsDAOImpl assetsDao;

    public AssetsDAOImpl getAssetsDao(){
        if(assetsDao == null) assetsDao = new AssetsDAOImpl(session);
        return assetsDao;
    }

    private ExpensesDAOImpl expensesDao;

    public ExpensesDAOImpl getExpensesDao(){
        if(expensesDao == null) expensesDao = new ExpensesDAOImpl(session);
        return expensesDao;
    }

    private IncomeDAOImpl incomeDao;

    public IncomeDAOImpl getIncomeDao(){
        if(incomeDao == null) incomeDao = new IncomeDAOImpl(session);
        return incomeDao;
    }


    private LiabilitiesDAOImpl liabilitiesDao;

    public LiabilitiesDAOImpl getLiabilitiesDao(){
        if(liabilitiesDao == null) liabilitiesDao = new LiabilitiesDAOImpl(session);
        return liabilitiesDao;
    }
}