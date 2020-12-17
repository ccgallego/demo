/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.dto.ConversorDTO;
import java.util.List;

/**
 *
 * @author cristiancg
 */
public interface ConversorService {
    
    ConversorDTO guardarRegistros(ConversorDTO c);
    List<ConversorDTO> mostrarRegistros();
    
}
