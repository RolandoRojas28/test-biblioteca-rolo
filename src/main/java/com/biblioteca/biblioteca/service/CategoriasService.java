/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Categorias;
import java.util.List;
import java.util.Optional;

public interface CategoriasService {
        public Categorias registrarCategorias(Categorias categorias);

        public List<Categorias> findAll();

        public Optional<Categorias> findById(Integer id);
}