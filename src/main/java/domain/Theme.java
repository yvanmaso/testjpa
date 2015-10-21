package domain;

import javax.persistence.Entity;

/**
 * Created by maso on 22/09/15.
 */

@Entity
public class Theme extends UserStory {
    public Theme(String descritption) {
        super(descritption);
    }
}
