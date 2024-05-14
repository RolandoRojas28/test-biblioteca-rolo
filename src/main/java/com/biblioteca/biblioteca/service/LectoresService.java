/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Lectores;
import java.util.List;
import java.util.Optional;

public interface LectoresService {
        public Lectores registrarLectores(Lectores lectores);

        public List<Lectores> findAll();

        public Optional<Lectores> findById(Integer id);
}
