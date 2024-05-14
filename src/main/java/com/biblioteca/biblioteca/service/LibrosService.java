/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Libros;
import java.util.List;
import java.util.Optional;

public interface LibrosService {
        public Libros registrarLibros(Libros libros);

        public List<Libros> findAll();

        public Optional<Libros> findById(Integer id);
}
