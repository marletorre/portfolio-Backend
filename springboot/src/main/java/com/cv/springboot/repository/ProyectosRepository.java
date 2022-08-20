
package com.cv.springboot.repository;

import com.cv.springboot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos,Integer>{
    
}
