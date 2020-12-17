/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services.impl;

import com.example.demo.entity.Conversor;
import com.example.demo.dto.ConversorDTO;
import com.example.demo.repository.ConversorRepository;
import com.example.demo.services.ConversorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

/**
 *
 * @author cristiancg
 */
@Service
public class DefaultConversorService implements ConversorService {
    @Autowired
    private ConversorRepository conversorRepository;

    @Autowired
    private ModelMapper mapper;
    

    @Override
    public ConversorDTO guardarRegistros(ConversorDTO datos) {
        conversorRepository.save(mapper.map(datos, Conversor.class));
        return datos;
    }

    @Override
    public List<ConversorDTO> mostrarRegistros() {
        List<Conversor> conversor = conversorRepository.findByOrderByFechaConsultaDesc();
        List<ConversorDTO> resultado = new ArrayList<>();
        if(!conversor.isEmpty() || conversor!=null){
            for(Conversor c: conversor){
                resultado.add(mapper.map(c, ConversorDTO.class));
            }
            return resultado;
        }
        return null;
    }

    
}
