package com.example;

public abstract class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true; 
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public String getTitulo() { 
        return titulo;
    }

    public abstract String getTipoMaterial();
    
    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}