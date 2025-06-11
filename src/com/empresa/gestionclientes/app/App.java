package com.empresa.gestionclientes.app;

import com.empresa.gestionclientes.dao.ClienteDAO;
import com.empresa.gestionclientes.modelo.Cliente;
import com.empresa.gestionclientes.vista.InterfazUsuario;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Gestión de clientes - Base de Datos ObjectDB");

        String nombre = InterfazUsuario.solicitarTexto("Ingrese el nombre del cliente");
        String apellido1 = InterfazUsuario.solicitarTexto("Ingrese el primer apellido");
        String apellido2 = InterfazUsuario.solicitarTexto("Ingrese el segundo apellido");
        String comercial = InterfazUsuario.solicitarTexto("Ingrese el nombre del comercial principal");
        Long idEmpresa = InterfazUsuario.solicitarNumero("Ingrese el ID de la empresa");

        Cliente nuevoCliente = new Cliente(nombre, apellido1, apellido2, comercial, idEmpresa);
        ClienteDAO.agregarCliente(nuevoCliente);

        System.out.println("\nCliente agregado correctamente. Lista de clientes:");
        List<Cliente> clientes = ClienteDAO.listarClientes();
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getId() + " - Nombre: " + c.getNombre());
        }
    }
}

