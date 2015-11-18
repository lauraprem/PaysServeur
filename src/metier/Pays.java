package metier;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@Entity
public class Pays {
    private String nomPays;
    private String nomCapitale;
    private long nbHabitants;

    @Id
    @Column(name = "NOM_PAYS")
    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Basic
    @Column(name = "NOM_CAPITALE")
    public String getNomCapitale() {
        return nomCapitale;
    }

    public void setNomCapitale(String nomCapitale) {
        this.nomCapitale = nomCapitale;
    }

    @Basic
    @Column(name = "NB_HABITANTS")
    public long getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }


}
