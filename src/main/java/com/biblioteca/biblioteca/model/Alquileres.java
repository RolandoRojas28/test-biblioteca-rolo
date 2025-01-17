/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.model;

/**
 *
 * @author Rolando Rojas
 */
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "alquileres")
@Builder
public class Alquileres {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_alquiler")
        private Integer idAlquileres;

        @ManyToOne(cascade = CascadeType.PERSIST)
        @JoinColumn(name = "id_lector")
        private Lectores idLector;

        @ManyToOne(cascade = CascadeType.PERSIST) 
        @JoinColumn(name = "id_libro")
        private Libros idLibro;

        @Column(name = "fecha_salida")
        private LocalDate fechaSalida;

        @Column(name = "fecha_entrada")
        private LocalDate fechaEntrada;


}
