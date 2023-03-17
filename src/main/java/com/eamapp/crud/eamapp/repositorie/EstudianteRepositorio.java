package com.eamapp.crud.eamapp.repositorie;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.eamapp.crud.eamapp.entity.Estudiante;

@Repository
public interface EstudianteRepositorio  extends JpaRepository<Estudiante, Long>{
    
}
