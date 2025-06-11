package com.empresa.gestionclientes.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String comercialPrincipal;
    private Long idEmpresa;

    @ElementCollection
    private List<String> visitas;

    public Cliente() {
        this.visitas = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido1, String apellido2, String comercialPrincipal, Long idEmpresa) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.comercialPrincipal = comercialPrincipal;
        this.idEmpresa = idEmpresa;
        this.visitas = new ArrayList<>();
    }


    public void agregarVisita(String fecha) {
        this.visitas.add(fecha);
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getComercialPrincipal() {
        return comercialPrincipal;
    }

    public void setComercialPrincipal(String comercialPrincipal) {
        this.comercialPrincipal = comercialPrincipal;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", comercialPrincipal='" + comercialPrincipal + '\'' +
                ", idEmpresa=" + idEmpresa +
                ", visitas=" + visitas +
                '}';
    }

}

