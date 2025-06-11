package com.empresa.gestionclientes.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionDB {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:db/ClientesDB.odb");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}

