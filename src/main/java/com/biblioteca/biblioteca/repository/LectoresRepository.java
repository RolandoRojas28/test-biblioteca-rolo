/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.repository;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Lectores;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectoresRepository  extends JpaRepository<Lectores, Integer> {
    List<Lectores> findByDni(String dni);
}
