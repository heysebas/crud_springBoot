package com.eamapp.crud.eamapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eamapp.crud.eamapp.service.EstudianteService;



@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService servicio;


    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", servicio.listarTodoLosEstudiantes());
        return "estudiantes";
    }
    
}
