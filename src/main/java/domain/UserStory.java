package domain;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * Created by maso on 22/09/15.
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_UserStory")
@DiscriminatorValue("UserStory")
public class UserStory
{

    private String descritption;

    private List<Team> equipes;

    private long id;


    public String getDescritption() {
        return descritption;
    }

    public void setDescritption(String descritption) {
        this.descritption = descritption;
    }
    @OneToMany(mappedBy = "UserStory",cascade = CascadeType.PERSIST)
    public List<Team> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Team> equipes) {
        this.equipes = equipes;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserStory(String descritption) {

        this.descritption = descritption;
    }
}
