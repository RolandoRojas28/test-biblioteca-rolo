/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.service.impl;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Editoriales;
import com.biblioteca.biblioteca.repository.EditorialesRepository;
import com.biblioteca.biblioteca.service.EditorialesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class EditorialesServiceImpl implements EditorialesService {
    @Autowired
        private EditorialesRepository repoEditoriales;

        @Transactional
        @Override
        public Editoriales registrarEditoriales(Editoriales editoriales) {
                return repoEditoriales.save(editoriales);
        }

        @Transactional(readOnly = true)
        @Override
        public List<Editoriales> findAll() {
                return repoEditoriales.findAll();
        }

        @Transactional(readOnly = true)
        @Override
        public Optional<Editoriales> findById(Integer id) {
                return repoEditoriales.findById(id);
        }
}
