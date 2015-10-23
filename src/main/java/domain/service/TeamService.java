package domain.service;

import domain.Personne;

/**
 * Created by maso on 22/10/15.
 */
public interface TeamService
{
    void createEquipes();
    Personne findPersonById(long id );
}
