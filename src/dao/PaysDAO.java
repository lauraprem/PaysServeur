package dao;

import metier.Pays;

import java.util.List;

/**
 * Created by Pierre on 08/09/2015.
 */
public interface PaysDAO {
    List<Pays> getAllPays();

    Pays getPays(String name);
}
