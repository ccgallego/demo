/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.entity.Conversor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cristiancg
 */

@Repository
public interface ConversorRepository extends JpaRepository<Conversor, Integer>{
    
    List<Conversor> findByOrderByFechaConsultaDesc();
    
}
