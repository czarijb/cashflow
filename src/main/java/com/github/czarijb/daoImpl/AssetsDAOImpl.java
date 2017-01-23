package com.github.czarijb.daoImpl;

import com.github.czarijb.model.Assets;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

/**
 * Created by aleksandr on 21.01.17.
 */
public class AssetsDAOImpl {

    private Session session;

    public AssetsDAOImpl(Session session){
        this.session = session;
    }

    public void addAssets(Assets assets) {
        try {
            session.beginTransaction();
            session.save(assets);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }

    }

    public void deleteAssets(Assets assets) {

        try {
            session.beginTransaction();
            session.delete(assets);
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public Assets getAssets(long id) {

        Assets result = null;

        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Assets.class);
            result = (Assets) criteria.uniqueResult();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return result;
    }

    public List<Assets> getAllAssets() {

        List<Assets> assetsList = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Assets.class);
            assetsList = criteria.list();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }

        return assetsList;
    }
}
