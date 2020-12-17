/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author cristiancg
 */

//Clase Entity que me permite comunicarme directamente con la base de datos

@Entity
@Table(name = "historialconsultas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conversor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private int id;
    private Timestamp fechaConsulta;
    private int cantidad;
    private String monedaOrigen;
    private String monedaDestino;
    private String resultado;
    
}
