package com.eamapp.crud.eamapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eamapp.crud.eamapp.entity.Estudiante;
import com.eamapp.crud.eamapp.repositorie.EstudianteRepositorio;

import java.util.List;

@Service
public class EstiduanteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepositorio repositorio;


    // Override es para suscribir el metodo
    @Override
    public List <Estudiante> listarTodoLosEstudiantes(){


        // findAll es como un * from en base de datos
        return repositorio.findAll();
    }
    
}
