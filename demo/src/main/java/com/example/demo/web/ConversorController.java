/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.web;

import com.example.demo.dto.ConversorDTO;
import com.example.demo.services.ConversorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cristiancg
 */

//Clase controller donde llamamos a los servicios y retornamos si el servicio fue exitoso o no.

@RestController
@RequestMapping("/conversor")
@CrossOrigin("*")
public class ConversorController {
    
    @Autowired
    public ConversorService service;
    
    @GetMapping
    public ResponseEntity<?> getList(){
        List<ConversorDTO> historial = service.mostrarRegistros();
        if(!historial.isEmpty()){
            return ResponseEntity.ok(historial);
        }
        return ResponseEntity.noContent().build();
    }
    
    @PostMapping
    public ResponseEntity<?> saveHistorial(@RequestBody ConversorDTO historial){
        ConversorDTO conversor = service.guardarRegistros(historial);
        if(conversor != null){
            return ResponseEntity.ok(historial);
        }
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/hello")
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok("Esto es un mensaje de bienvenida");
    }
    
}
