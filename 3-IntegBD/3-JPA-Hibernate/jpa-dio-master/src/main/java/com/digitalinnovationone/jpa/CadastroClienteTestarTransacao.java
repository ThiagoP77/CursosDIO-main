package com.digitalinnovationone.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.digitalinnovationone.jpa.model.Cliente;

public class CadastroClienteTestarTransacao {

    public static void main(String... string) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNome("Joao Paulo");
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}

