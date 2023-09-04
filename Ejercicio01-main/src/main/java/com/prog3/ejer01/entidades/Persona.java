package com.prog3.ejer01.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona implements Serializable {

        @Id
        @GeneratedValue()
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;




}
