package com.example.login.models;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name="users")
public class AppUser {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;

    @Column(unique = true, nullable = false)
    private String email;

    private String telefono;
    private String direccion;
    private String password;
    private Date createdAt;


    // Getter y Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getter y Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Getter y Setter para direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter y Setter para password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter y Setter para createdAt
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}



