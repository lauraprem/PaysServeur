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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pays pays = (Pays) o;

        if (nbHabitants != pays.nbHabitants) return false;
        if (nomPays != null ? !nomPays.equals(pays.nomPays) : pays.nomPays != null) return false;
        if (nomCapitale != null ? !nomCapitale.equals(pays.nomCapitale) : pays.nomCapitale != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomPays != null ? nomPays.hashCode() : 0;
        result = 31 * result + (nomCapitale != null ? nomCapitale.hashCode() : 0);
        result = 31 * result + (int) (nbHabitants ^ (nbHabitants >>> 32));
        return result;
    }
}
