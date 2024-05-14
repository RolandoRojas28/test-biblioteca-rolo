/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Categorias;
import com.biblioteca.biblioteca.repository.CategoriasRepository;
import com.biblioteca.biblioteca.service.CategoriasService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CategoriasServiceImpl implements CategoriasService {
        @Autowired
        private CategoriasRepository repoCategorias;

        @Transactional
        @Override
        public Categorias registrarCategorias(Categorias categorias) {
                return repoCategorias.save(categorias);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Categorias> findAll() {
                return repoCategorias.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Categorias> findById(Integer id) {
                return repoCategorias.findById(id);
        }
}
