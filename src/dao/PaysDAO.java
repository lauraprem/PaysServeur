package dao;

import metier.Pays;

import java.util.List;


public interface PaysDAO {
    List<Pays> getAllPays();

    Pays getPays(String name);
}
