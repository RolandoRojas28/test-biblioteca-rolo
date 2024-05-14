/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Alquileres;
import com.biblioteca.biblioteca.repository.AlquileresRepository;
import com.biblioteca.biblioteca.service.AlquileresService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AlquileresServiceImpl implements AlquileresService {
        @Autowired
        private AlquileresRepository repoAlquileres;

        @Transactional
        @Override
        public Alquileres registrarAlquileres(Alquileres alquileres) {
                return repoAlquileres.save(alquileres);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Alquileres> findAll() {
                return repoAlquileres.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Alquileres> findById(Integer id) {
                return repoAlquileres.findById(id);
        }
}
