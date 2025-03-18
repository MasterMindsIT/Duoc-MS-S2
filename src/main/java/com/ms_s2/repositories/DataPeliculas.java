package com.ms_s2.repositories;

import java.util.ArrayList;
import java.util.List;

import com.ms_s2.entities.Peliculas;

public class DataPeliculas {
     List<Peliculas> peliculas;

    // Constructor to initialize and populate the list
    public DataPeliculas() {
        peliculas = new ArrayList<>();
        peliculas.add(new Peliculas(1, "Titanic", 1997, "James Cameron", "Drama", "Un joven pobre y un joven rico se enamoran en un barco que se hunde"));
        peliculas.add(new Peliculas(2, "El Padrino", 1972, "Francis Ford Coppola", "Drama", "La historia de una familia mafiosa en Nueva York."));
        peliculas.add(new Peliculas(3, "El Caballero Oscuro", 2008, "Christopher Nolan", "Acción", "Batman enfrenta al Joker, un criminal caótico."));
        peliculas.add(new Peliculas(4, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La vida extraordinaria de un hombre con un corazón puro."));
        peliculas.add(new Peliculas(5, "Matrix", 1999, "Lana y Lilly Wachowski", "Ciencia Ficción", "Un hacker descubre la verdad sobre su realidad."));
        peliculas.add(new Peliculas(6, "Gladiador", 2000, "Ridley Scott", "Acción", "Un general romano busca venganza como gladiador."));
        peliculas.add(new Peliculas(7, "Avatar", 2009, "James Cameron", "Ciencia Ficción", "Un soldado se une a los Na'vi en Pandora."));
    }

    // Getter for peliculas
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    // get by id
    public Peliculas getPeliculaById(int id) {
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }

}
