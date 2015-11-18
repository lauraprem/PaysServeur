package ws;

import dao.PaysDAO;
import dao.PaysDAOImpl;
import metier.Pays;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class PaysWebService {
    @WebMethod
    public List<Pays> obtainListePays(){
        PaysDAO paysDAO = new PaysDAOImpl();
        return paysDAO.getAllPays();
    }

    @WebMethod
    public Pays getPays(String name) {
        PaysDAO paysDAO = new PaysDAOImpl();
        return paysDAO.getPays(name);
    }
}
