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
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
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

        int numOfEquipe = manager.createQuery("select t from Team t").getResultList().size();
        if (numOfEquipe == 0) {


            Team java = new Team("java");

            for (int i = 0; i < 10; i++) {
                Personne membre = new Personne("Yvan" + i);
                membre.setPrenom("Christian" + i);
                java.getPersonnes().add(membre);
                manager.persist(java);


            }

        }

    }

}

