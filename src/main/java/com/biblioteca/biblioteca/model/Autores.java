/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.biblioteca.biblioteca.model;

/**
 *
 * @author Rolando Rojas
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "autores")
@Builder

public class Autores {

   @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_autor")
        private Integer idAutor;
        @Column(name = "autor")
        private String autor;

}
