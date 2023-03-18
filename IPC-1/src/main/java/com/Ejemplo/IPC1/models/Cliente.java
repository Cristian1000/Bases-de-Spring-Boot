package com.ejemplo.ipc1.models;
// Generated 14/03/2023 07:01:57 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="Cliente"
    ,schema="public"
)
public class Cliente  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private Integer edad;
     private String direccion;

    public Cliente() {
    }

	
    public Cliente(int id, String name, String lastname, Integer edad, String direccion) {
        this.id = id;
        this.nombre = name;
        this.apellido = lastname;
        this.edad = edad;
        this.direccion = direccion;
    }
//    public Cliente(int id, String name, String lastname, String email, Date createAt) {
//       this.id = id;
//       this.name = name;
//       this.lastname = lastname;
//       this.email = email;
//       this.createAt = createAt;
//    }
   
     @Id 
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido", nullable=false)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="edad", nullable=false)
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Column(name="direccion", length=13)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}

