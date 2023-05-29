/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PeliculaService {
    
     private Pelicula p;
    private ArrayList<Pelicula> peli;

    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> lista = new ArrayList<>();

    public void creacion() {
        peli = new ArrayList<>();
        boolean resp = true;

        do {
            p = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());

            peli.add(p);

            System.out.println("¿Desea agregar otra pelicula?");
            if ("no".equalsIgnoreCase(leer.next())) {
                resp = false;
            }
        } while (resp);
        lista.addAll(peli);
    }

 public void mostrar() {

        System.out.println("Lista de Peliculas:");
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
    }

    public void duracionMayor() {

        System.out.println("Peliculas con duracion mayor a una hora");
        for (Pelicula dur : lista) {
            if (dur.getDuracion() >= 60) {
                System.out.println(dur);
            }
        }
    }
    
    public void ordenarDuracionDeMayorAMenor() {
        
        System.out.println("Peliculas ordenadas por su duracion de mayor a menor");
        lista.sort(Pelicula.ordenarDeMayorAMenor);
        System.out.println(lista);
    }
    
     public void ordenarDuracionDeMenorAMayor () {
        
        System.out.println("Peliculas ordenadas por su duracion de menor de mayor");
        lista.sort(Pelicula.ordenarDeMenorAMayor);
        System.out.println(lista);
    }
    
    
    public void ordenarTitulo () {
        
     lista.sort(Pelicula.ordenarTitulo);
        System.out.println("Peliculas ordenadas alfabeticamente por tÃ­tulo");
        System.out.print(lista);
    
    }
    
     public void ordenarDirector () {
        
     lista.sort(Pelicula.ordenarDirector);
        System.out.println("Peliculas ordenadas alfabeticamente por director");
        System.out.print(lista);
    
    }

}
