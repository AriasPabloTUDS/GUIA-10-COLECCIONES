/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;
import javafx.stage.DirectoryChooser;

/**
 *
 * @author Pablo
 */
public class Pelicula {

    private String Director;
    private String Titulo;
    private Integer Duracion;

    public Pelicula(String Director, String Titulo, int Duracion) {
        this.Director = Director;
        this.Titulo = Titulo;
        this.Duracion = Duracion;
    }

    public Pelicula() {
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Integer getDuracion() {
        return Duracion;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Director=" + Director + ", Titulo=" + Titulo + ", Duracion=" + Duracion + '}';
    }

     public static Comparator <Pelicula> ordenarDeMayorAMenor = new Comparator<Pelicula>() {
        
        public int compare (Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    
      public static Comparator <Pelicula> ordenarDeMenorAMayor = new Comparator<Pelicula>() {
        
        public int compare (Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
       public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };


}
