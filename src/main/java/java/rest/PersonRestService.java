package java.rest;

import domain.Personne;
import domain.Team;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by yvan on 19/10/2015.
 */

/**
 * *Cette Classe permet de faire la répresentation du service Rest du Team à la Personne
 */

@Path("/Person")
public class PersonRestService 
{

    public Team t=new Team("M2 GLa Dream-Team");
    
    public PersonRestService() 
    {
       
        for (int i = 0; i < 10; i++)
        {
            Personne p=new Personne();
            
            p.setNom("N°"+i);
            t.getPersonnes().add(p);
        }
    }
    
    
    @GET
    @Path("/search/{id}")
    @Produces({ MediaType.APPLICATION_XML })
    public Personne getPerson(@PathParam("id") String arg0)
    {
        
        return t.getPersonnes().get(Integer.parseInt(arg0));
    }
    
    @DELETE
    @Path("/delete{id}")
    @Produces({ MediaType.APPLICATION_XML })
    public void deletePerson(@PathParam("id") String arg0)
    {
        t.getPersonnes().remove(Integer.parseInt(arg0));
    }
    
    
}
