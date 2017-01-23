package com.github.czarijb.daoImpl;


import com.github.czarijb.model.Liabilities;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

/**
 * Created by aleksandr on 21.01.17.
 */
public class LiabilitiesDAOImpl {

    private Session session;

    public LiabilitiesDAOImpl(Session session){
        this.session = session;
    }

    public void addLiabilities(Liabilities liabilities) {

        try {
            session.beginTransaction();
            session.save(liabilities);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteLiabilities(Liabilities liabilities) {

        try {
            session.beginTransaction();
            session.delete(liabilities);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public Liabilities getLiabilities(long id) {

        Liabilities result = null;

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Liabilities.class);
            result = (Liabilities) criteria.uniqueResult();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<Liabilities> getAllLiabilities() {

        List<Liabilities> liabilitiesList = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Liabilities.class);
            liabilitiesList = criteria.list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return liabilitiesList;
    }
}
