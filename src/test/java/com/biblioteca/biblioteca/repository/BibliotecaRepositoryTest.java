/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.model.Alquileres;
import com.biblioteca.biblioteca.model.Autores;
import com.biblioteca.biblioteca.model.Categorias;
import com.biblioteca.biblioteca.model.Editoriales;
import com.biblioteca.biblioteca.model.Lectores;
import com.biblioteca.biblioteca.model.Libros;
import com.biblioteca.biblioteca.service.impl.LibrosServiceImpl;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class BibliotecaRepositoryTest {

    @Autowired
    private LibrosRepository repoLibros;
    @Autowired
    private AlquileresRepository repoAlquileres;
    @Autowired
    private AutoresRepository repoAutores;
    @Autowired
    private CategoriasRepository repoCategorias;
    @Autowired
    private EditorialesRepository repoEditoriales;
    @Autowired
    private LectoresRepository repoLectores;
    @InjectMocks
    private LibrosServiceImpl serviceLibrosMock;
    private Libros Libros1;
    private Libros Libros2;
    private List<Libros> listLibross;

    private Autores autor;
    private Autores saveAutor;

    private Categorias categoria;
    private Categorias saveCategoria;

    private Editoriales editorial;
    private Editoriales saveEditorial;

    private Alquileres alquiler;
    private Alquileres saveAlquiler;

    private Lectores lector;
    private Lectores saveLector;

    @BeforeEach
    void setUp() throws Exception{
                
                autor = Autores.builder()
                                .autor("César Vallejo")
                                .build();
		
                saveAutor = Autores.builder()
                                .idAutor(1)
                                .autor("César Vallejo")
                                .build();

                
                categoria = Categorias.builder()
                                .categoria("Poesía")
                                .build();
		
                saveCategoria = Categorias.builder()
                                .idCategoria(1)
                                .categoria("Poesía")
                                .build();

                
                editorial = Editoriales.builder()
                                .editorial("Editorial Minerva")
                                .build();
		
                saveEditorial = Editoriales.builder()
                                .idEditorial(1)
                                .editorial("Editorial Minerva")
                                .build();

                Libros1 = Libros.builder()
                                .titulo("Los heraldos negros")
                                .fechaDeLanzamiento(LocalDate.of(1919, 07, 01))
                                .autores(autor)
                                .categorias(categoria)
                                .editoriales(editorial)
                                .idioma("Castellano")
                                .paginas(352)
                                .descripcion("Los heraldos negros es una colección de poemas de César Vallejo que aborda")
                                .portada("portadas/los-heraldos-negros.jpg")
                                .build();

                Libros2 = Libros.builder()
                                .titulo("Los heraldos negros")
                                .fechaDeLanzamiento(LocalDate.of(1919, 07, 01))
                                .autores(autor)
                                .categorias(categoria)
                                .editoriales(editorial)
                                .idioma("Castellano")
                                .paginas(80)
                                .descripcion("Los heraldos negros es una colección de poemas de César Vallejo que aborda el")
                                .portada("portadas/los-heraldos-negros.jpg")
                                .build();
                
                lector = Lectores.builder()
                                .dni("72936795")
                                .nombre("Rolando Rojas")
                                .telefono("961456421")
                                .direccion("Jr. José Olaya 528")
                                .codigoPostal("222202")
                                .observaciones("Debe 2 libros")
                                .build();
		
                saveLector = Lectores.builder()
                                .dni("72936795")
                                .nombre("Rolando Rojas")
                                .telefono("961456421")
                                .direccion("Jr. José Olaya 528")
                                .codigoPostal("222202")
                                .observaciones("Debe 2 libros")
                                .build();

                
                alquiler = Alquileres.builder()
                                .idLector(lector)
                                .idLibro(Libros1)
                                .fechaSalida(LocalDate.now())
                                .fechaEntrada(LocalDate.of(2024, 05, 10))
                                .build();
		
                saveAlquiler = Alquileres.builder()
                                .idLector(lector)
                                .idLibro(Libros1)
                                .fechaSalida(LocalDate.now())
                                .fechaEntrada(LocalDate.of(2024, 05, 28))
                                .build();
                listLibross = List.of(Libros1, Libros2);
    }
    @AfterEach
    void tearDown() throws Exception{
        Libros1 = null;
        Libros2 = null;
       
    }

    @DisplayName("Libros - CP1: Prueba de inserción de un nuevo libro")
    @Test
    void repo_libro_save_returnSaveLibros(){
        Libros saveLibros = repoLibros.save(Libros1);
        assertNotNull(saveLibros);
        assertEquals(saveLibros.getTitulo(), "Los heraldos negros");
        assertThat(saveLibros.getASIN()).isNotNull();
    }

    @DisplayName("Libros - CP2: Prueba de búsqueda de libros por titulo")
    @Test
    void repo_libro_save_returnLibrosTitulo(){
        
        Libros libroGuardado = repoLibros.save(Libros1);

       
        List<Libros> librosEncontrados = repoLibros.findByTitulo("Los heraldos negros");

        
        assertFalse(librosEncontrados.isEmpty());

        assertEquals("Los heraldos negros", libroGuardado.getTitulo());
    }

    @DisplayName("Alquileres - CP1: Prueba de registro de un nuevo alquiler")
    @Test
    void repo_alquier_save_returnSaveAlquiler(){
        Alquileres saveAlquiler = this.repoAlquileres.save(alquiler);
        assertNotNull(saveAlquiler);
        assertEquals(saveAlquiler.getIdLibro(), Libros1);

    }

    @DisplayName("Alquileres - CP2: Prueba de devolución de un libro alquilado")
    @Test
    void repo_alquiler_devolucion_returnLibroFechaIngreso() {
        
        Alquileres alquilerGuardado = repoAlquileres.save(alquiler);
        assertNotNull(alquilerGuardado);

      
        alquilerGuardado.setFechaEntrada(LocalDate.now()); 
        Alquileres alquilerDevolucion = repoAlquileres.save(alquilerGuardado);

     
        assertNotNull(alquilerDevolucion);

        
        assertNotNull(alquilerDevolucion.getFechaEntrada());
    }

    @DisplayName("Autores - CP1: Prueba de inserción de un nuevo autor")
    @Test
    void repo_autores_save_returnSaveAutorr(){
        Autores saveAutor = this.repoAutores.save(autor);
        assertNotNull(saveAutor);
        assertEquals(saveAutor.getAutor(), "César Vallejo");

    }

    @DisplayName("Autores - CP2: Prueba de búsqueda de autores por nombre")
    @Test
    void repo_Autores_save_returnAutoresNombre(){
        
        Autores autorGuardado = repoAutores.save(autor);

       
        List<Autores> autoresEncontrados = repoAutores.findByAutor("César Vallejo");

    
        assertFalse(autoresEncontrados.isEmpty());
        assertEquals("César Vallejo", autorGuardado.getAutor());
    }

    @DisplayName("Categorias - CP1: Prueba de inserción de una nueva categoría")
    @Test
    void repo_categorias_save_returnSaveCategoria(){
        Categorias saveCategoria = this.repoCategorias.save(categoria);
        assertNotNull(saveCategoria);
        assertEquals(saveCategoria.getCategoria(), "Poesía");

    }

    @DisplayName("Categorias - CP2: Prueba de búsqueda de categorías por nombre")
    @Test
    void repo_categoria_save_returnCategoriaNombre(){
        
        Categorias categoriaGuardada = repoCategorias.save(categoria);

       
        List<Categorias> categoriasEncontradas = repoCategorias.findByCategoria("Poesía");

        
        assertFalse(categoriasEncontradas.isEmpty());
        assertEquals("Poesía", categoriaGuardada.getCategoria());
    }   

    @DisplayName("Editoriales - CP1: Prueba de inserción de una nueva editorial")
    @Test
    void repo_editoriales_save_returnSaveEditorial(){
        Editoriales saveEditorial = this.repoEditoriales.save(editorial);
        assertNotNull(saveEditorial);
        assertEquals(saveEditorial.getEditorial(), "Editorial Minerva");

    }
    @DisplayName("Editoriales - CP2: Prueba de búsqueda de editoriales por nombre")
    @Test
    void repo_Editorial_save_returnEditorialPorNombre(){
       
        Editoriales editorialGuardada = repoEditoriales.save(editorial);

       
        List<Editoriales> editorialesEncontradas = repoEditoriales.findByEditorial("Editorial Minerva");

      
        assertFalse(editorialesEncontradas.isEmpty());
        assertEquals("Editorial Minerva", editorialGuardada.getEditorial());
    }   

    @DisplayName("Lectores - CP1: Prueba de inserción de un nuevo lector")
    @Test
    void repo_lectores_save_returnSaveLectores(){
        Lectores saveLector = this.repoLectores.save(lector);
        assertNotNull(saveLector);
        assertEquals(saveLector.getNombre(), "Rolando Rojas");

    }

    @DisplayName("Lectores - CP2: Prueba de búsqueda de lectores por DNI")
    @Test
    void repo_lectores_save_returnLectoresPorDni(){
        
        Lectores lectorGuardado = repoLectores.save(lector);

        
        List<Lectores> lectoresEncontrados = repoLectores.findByDni(lector.getDni());

      
        assertFalse(lectoresEncontrados.isEmpty()); 

        
        Lectores libroEncontrado = lectoresEncontrados.get(0);
        assertEquals(lectorGuardado.getDni(), libroEncontrado.getDni());
    }
    
    
}