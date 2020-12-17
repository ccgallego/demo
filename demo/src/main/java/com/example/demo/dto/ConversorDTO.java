/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author cristiancg
 */

//Clase que me permite comunicarme con el usuario, capturar sus datos y mapearlos a la entity class.

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConversorDTO {
    private int id;
    private Timestamp fechaConsulta;
    private int cantidad;
    private String monedaOrigen;
    private String monedaDestino;
    private String resultado;
    
    
    
}
