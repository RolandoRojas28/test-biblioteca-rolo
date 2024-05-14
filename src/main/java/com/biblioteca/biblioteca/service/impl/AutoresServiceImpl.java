/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Autores;
import com.biblioteca.biblioteca.repository.AutoresRepository;
import com.biblioteca.biblioteca.service.AutoresService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AutoresServiceImpl implements AutoresService {
        @Autowired
        private AutoresRepository repoAutores;

        @Transactional
        @Override
        public Autores registrarAutores(Autores autores) {
                return repoAutores.save(autores);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Autores> findAll() {
                return repoAutores.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Autores> findById(Integer id) {
                return repoAutores.findById(id);
        }
}

