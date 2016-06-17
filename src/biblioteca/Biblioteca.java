/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import utilidades.*;

/**
 *
 * @dama
 */
public class Biblioteca {

    
    public static void main(String[] args) {
        
        ArrayList<Libro> libros = new ArrayList<>();
        int opcion;
        do {
            mostrarMenu();
            opcion = EntradaDatos.pedirEntero("Escoge una opción!");

            switch (opcion) {
                case 1:
                    Libro nuevo = altaLibro();
                    libros.add(nuevo);
                    System.out.println("El libro está dado de alta");
                    break;
                case 2:
                    consultarLibro(libros);
                    break;
                case 3:
                    listarLibrosPorGenero(libros);
                    break;
                case 4:
                    maxPaginas(libros);
                    break;
                case 5:
                    totales(libros);
                    break;
                case 6:
                    asignarNumero(libros);
                    break;
                default:

            }

        } while (opcion != 6);

    }

    private static void asignarNumero(ArrayList<Libro> libros) {
        for (Libro actual: libros) {
            System.out.println("El número asignado es: " + actual.getNumero()); 
        }
       
    }

    private static void totales(ArrayList<Libro> libros) {
        System.out.println("Total de libros:" + libros.size() + "libros");

        int contador = 0;
        double suma = 0;

        for (Libro actual : libros) {
            if (actual.isPrestamo()) {
                contador++;
            }
            
            suma += actual.getPrecio();
        }
        System.out.println("El número de libros en préstamo es: " + contador);
        System.out.println("El coste total de los libros es : " + suma);
    }

    private static void maxPaginas(ArrayList<Libro> libros) {
        int maxpages = 0;
        String tittle = "";

        for (Libro actual : libros) {
            if (actual.getPaginas() > maxpages) {
                maxpages = actual.getPaginas();
                tittle = actual.getTitulo();
            }
        }
        System.out.println("El libro con mayor páginas es: " + tittle + "con" + maxpages + "páginas");


    }

    private static void listarLibrosPorGenero(ArrayList<Libro> libros) {

        
        String gender = EntradaDatos.pedirCadena("Introduce un género!");

        for (Libro actual : libros) {
            if (gender.equalsIgnoreCase(actual.getGenero())) {
                System.out.println(actual);
            }
        }

    }

    private static void consultarLibro(ArrayList<Libro> libros) {
        
        String code = EntradaDatos.pedirCadena("Introduce un código!");

        for (Libro actual : libros) {
            
            if (actual.getCodigo().equalsIgnoreCase(code)) {
                System.out.println(actual);
            }


        }
    }

    private static Libro altaLibro() {
        String code = EntradaDatos.pedirCadena("Introduce un código alfanumérico!");
        boolean exist = false;
        if (exist == true) {
            System.out.println("Este código ya existe.");
        }
        String tittle = EntradaDatos.pedirCadena("Introduce un título!");
        String author = EntradaDatos.pedirCadena("Introduce un autor");
        int pages = EntradaDatos.pedirEntero("Introduce un número de páginas!");
        String gender = EntradaDatos.pedirCadena("Introduce un género!");
        double price = EntradaDatos.pedirDouble("Introduce un precio");
        String response = EntradaDatos.pedirCadena("¿Es préstamo (S/N)?");
        boolean loan;
        if (response.equalsIgnoreCase("S")) {
            loan = true;
        } else {
            loan = false;
        }
        Libro nuevo = new Libro(code, tittle, author, pages, gender, price, loan);
        return nuevo;
    }

    private static void mostrarMenu() {
        System.out.println("1. Nuevo libro.");
        System.out.println("2. Consultar datos de un libro.");
        System.out.println("3. Listado de libros de un género.");
        System.out.println("4. Libro con mayor número de páginas.");
        System.out.println("5. Totales.");
        System.out.println("6. Asignar número a cada libro.");
        System.out.println("-------------------");
    }
}
