/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.repository;

/**
 *
 * @author Rolando Rojas
 */
import com.biblioteca.biblioteca.model.Alquileres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquileresRepository  extends JpaRepository<Alquileres, Integer>{

}
