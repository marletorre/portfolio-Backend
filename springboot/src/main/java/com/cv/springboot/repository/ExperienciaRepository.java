
package com.cv.springboot.repository;

import com.cv.springboot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Integer>{
    
}
