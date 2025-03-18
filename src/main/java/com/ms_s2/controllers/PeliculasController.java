package com.ms_s2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms_s2.entities.Peliculas;
import com.ms_s2.repositories.DataPeliculas;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

    private DataPeliculas dataPeliculas = new DataPeliculas();
        
        @GetMapping
        public ResponseEntity<List<Peliculas>> allPeliculas() {
            return ResponseEntity.ok(dataPeliculas.getPeliculas());
        }
        
        @GetMapping("/{id}")
        public ResponseEntity<?> getPelicula(@PathVariable int id) {
            Peliculas pelicula = dataPeliculas.getPeliculaById(id);
            if (pelicula == null) {
                return ResponseEntity.status(404).body(String.format("{\"message\": \"No se encontró la película con el ID= %d proporcionado\"}", id));
            }
            return ResponseEntity.ok(pelicula);
        }
        
     

}
