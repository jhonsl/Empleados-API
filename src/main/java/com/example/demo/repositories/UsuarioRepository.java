package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{

    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    //Agregamos un nuevo metodo abstracto para buscar por medio de los trabajos
    public abstract ArrayList<UsuarioModel> findByTrabajo(String trabajo);
    //Agregamos un nuevo metodo abstracto para buscar por medio de los nombress
    public abstract ArrayList<UsuarioModel> findByNombre(String trabajo);
}
