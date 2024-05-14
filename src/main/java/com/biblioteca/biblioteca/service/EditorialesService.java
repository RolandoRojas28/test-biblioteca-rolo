/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Editoriales;
import java.util.List;
import java.util.Optional;

public interface EditorialesService {
        public Editoriales registrarEditoriales(Editoriales editariales);

        public List<Editoriales> findAll();

        public Optional<Editoriales> findById(Integer id);
}