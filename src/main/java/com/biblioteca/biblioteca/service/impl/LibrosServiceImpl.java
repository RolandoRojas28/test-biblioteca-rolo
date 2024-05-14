/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Libros;
import com.biblioteca.biblioteca.repository.LibrosRepository;
import com.biblioteca.biblioteca.service.LibrosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class LibrosServiceImpl implements LibrosService {
        @Autowired
        private LibrosRepository repoLibros;

        @Transactional
        @Override
        public Libros registrarLibros(Libros Libros) {
                return repoLibros.save(Libros);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Libros> findAll() {
                return repoLibros.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Libros> findById(Integer id) {
                return repoLibros.findById(id);
        }
}