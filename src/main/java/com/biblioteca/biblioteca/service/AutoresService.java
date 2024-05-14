/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Autores;
import java.util.List;
import java.util.Optional;

public interface AutoresService {
        public Autores registrarAutores(Autores autores);

        public List<Autores> findAll();

        public Optional<Autores> findById(Integer id);
}
