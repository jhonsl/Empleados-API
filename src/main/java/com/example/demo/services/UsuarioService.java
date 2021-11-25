package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

    //Le agregamos la funcion de obtener los trabajadores de un determinado puesto
    public ArrayList<UsuarioModel> obtenerPorTrabajo(String trabajo){
        return usuarioRepository.findByTrabajo(trabajo);
    }

    public ArrayList<UsuarioModel> obtenerPorPriodidad(Integer prioridad){
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //Le agregamos un metodo para obtener trabajadores con igual nombre
    public ArrayList<UsuarioModel> obtenerPorNombre(String nombre){
        return usuarioRepository.findByNombre(nombre);
    }

    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
