package com.ms_s2.entities;

public class Peliculas { //Entidad Peliculas
    public int id;
    public String titulo;
    public int anio;
    public String director;
    public String genero;
    public String sinopsis;
    //constructor con todos los atributos
    public Peliculas(int id, String titulo, int anio, String director, String genero, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //Aqui van los getters y setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    //funcion para mostrar todo el objeto
    @Override
    public String toString() {
        return "Peliculas{" + "id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", director=" + director + ", genero=" + genero + ", sinopsis=" + sinopsis + '}';
    }
}
