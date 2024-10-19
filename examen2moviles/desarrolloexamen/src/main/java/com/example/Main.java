package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, "123456789", 600);
        Revista revista1 = new Revista("National Geographic", "Varios", 2022, 5, "Mayo");
        Audiovisual audiovisual1 = new Audiovisual("Inception", "Christopher Nolan", 2010, "Blu-ray", 148);
 
        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);
 
        biblioteca.mostrarCatalogo();
 
        libro1.prestar();
        System.out.println("Después del préstamo:");
        biblioteca.mostrarCatalogo();
 
        libro1.devolver();
        System.out.println("Después de la devolución:");
        biblioteca.mostrarCatalogo();
    }
}