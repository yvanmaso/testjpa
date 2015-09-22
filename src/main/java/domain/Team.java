package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maso on 21/09/15.
 */
public class Team
{
    private long id;
    private String nom;

    @Id
    @GeneratedValue
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

    public Team(String nom) {

        this.nom = nom;
    }

    private List<Personne> personnes;

    @OneToMany(mappedBy = "Team",cascade = CascadeType.PERSIST)
    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }
}
