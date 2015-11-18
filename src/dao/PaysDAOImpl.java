package dao;

import metier.Pays;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtils;

import java.util.List;


public class PaysDAOImpl implements PaysDAO{

    @Override
    public List<Pays> getAllPays() {
        Session currentSession = HibernateUtils.getSession();
        Query query = currentSession.createQuery("from Pays");

        List<Pays> pays = query.list();
        currentSession.close();
        return pays;
    }

    @Override
    public Pays getPays(String name) {
        Session currentSession = HibernateUtils.getSession();
        Query query = currentSession.createQuery("from Pays where nom_pays=:pays");
        query.setString("pays", name);

        List<Pays> pays = query.list();
        currentSession.close();
        return pays.get(0);
    }
}
