package domain;

import javax.persistence.Entity;

/**
 * Created by maso on 22/09/15.
 */

@Entity
public class Epic extends UserStory
{
    public Epic(String descritption) {
        super(descritption);
    }
    
}
