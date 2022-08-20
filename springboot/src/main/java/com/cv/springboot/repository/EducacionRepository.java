package com.cv.springboot.repository;

import com.cv.springboot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion,Integer> {
    
}
