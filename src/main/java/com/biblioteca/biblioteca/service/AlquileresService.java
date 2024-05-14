/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Alquileres;
import java.util.List;
import java.util.Optional;

public interface AlquileresService {
     public Alquileres registrarAlquileres(Alquileres alquileres);

        public List<Alquileres> findAll();

        public Optional<Alquileres> findById(Integer id);
}