package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private String trabajo; //Le agregamos un cargo a ciertos trabajadores
    private Integer prioridad;

    public void setId(Long id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTrabajo(String trabajo){ //Agregamos el respectivo Setter
        this.trabajo = trabajo;
    }

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public Long getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTrabajo(){ //Agregamos el respectivo Getter
        return this.trabajo;
    }

    public Integer getPrioridad(){
        return this.prioridad;
    }
}
