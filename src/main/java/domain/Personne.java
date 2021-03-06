package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by maso on 21/09/15.
 */
@Entity
public class Personne
{
    private long id;
    private String nom;
    private String prenom;

    public Personne(String prenom) {

        this.prenom = prenom;
    }

    public Personne() {

    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
