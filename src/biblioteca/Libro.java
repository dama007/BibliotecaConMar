/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author usu21
 */
public class Libro {
   
    private String codigo;
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;
    private double precio;
    private boolean prestamo;
    private int numero;
    private static int counter = 1;

    public Libro(String codigo, String titulo, String autor, int paginas, String genero, double precio, boolean prestamo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
        this.precio = precio;
        this.prestamo = prestamo;
        if (prestamo) {
            System.out.println("Es préstamo.");
        } else {
            System.out.println("Es de propiedad.");
        }
        
        numero = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", genero=" + genero + ", precio=" + precio + ", prestamo=" + prestamo + '}';
    }
    
    
    
    
    public int getNumero() {
        return numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
    
    
    
    
    
    
    
}
