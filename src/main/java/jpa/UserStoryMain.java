package jpa;

import domain.Personne;
import domain.Team;
import domain.UserStory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by maso on 22/09/15.
 */
public class UserStoryMain {

    private EntityManager manager;

    public UserStoryMain(EntityManager manager) {
        this.manager = manager;
    }


    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
        EntityManager manager = factory.createEntityManager();

        UserStoryMain test = new UserStoryMain(manager);
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            // TODO
            test.createEquipes();

        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        manager.close();
        factory.close();
    }


    private void createEquipes() {

        int numOfEquipe = manager.createQuery("select * from Team").getResultList().size();
        if (numOfEquipe == 0) {
            Team java = new Team("java");


            Personne personnne1 = new Personne("Yvan");
            personnne1.setPrenom("Christian");

            Personne personnne2 = new Personne("Maso");
            personnne2.setPrenom("Maso");


            manager.persist(personnne1);
            manager.persist(personnne2);


            java.getPersonnes().add(personnne1);
            java.getPersonnes().add(personnne1);


            manager.persist(java);

        }

    }

}


