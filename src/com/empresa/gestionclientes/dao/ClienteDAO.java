package com.empresa.gestionclientes.dao;

import com.empresa.gestionclientes.conexion.ConexionDB;
import com.empresa.gestionclientes.modelo.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO {

    public static void agregarCliente(Cliente cliente) {
        EntityManager em = ConexionDB.getEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static Cliente buscarCliente(Long id) {
        EntityManager em = ConexionDB.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        em.close();
        return cliente;
    }

    public static void actualizarCliente(Cliente cliente) {
        EntityManager em = ConexionDB.getEntityManager();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public static void eliminarCliente(Long id) {
        EntityManager em = ConexionDB.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        if (cliente != null) {
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        }
        em.close();
    }

    public static List<Cliente> listarClientes() {
        EntityManager em = ConexionDB.getEntityManager();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        em.close();
        return clientes;
    }
}

