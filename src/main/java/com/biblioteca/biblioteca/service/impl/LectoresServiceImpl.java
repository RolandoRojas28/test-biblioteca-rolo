/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Lectores;
import com.biblioteca.biblioteca.repository.LectoresRepository;
import com.biblioteca.biblioteca.service.LectoresService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class LectoresServiceImpl implements LectoresService {
        @Autowired
        private LectoresRepository repoLectores;

        @Transactional
        @Override
        public Lectores registrarLectores(Lectores lectores) {
                return repoLectores.save(lectores);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Lectores> findAll() {
                return repoLectores.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Lectores> findById(Integer id) {
                return repoLectores.findById(id);
        }
}