/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Paises;
import Entidad.Servicio.Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PaisesServicios {

HashSet<Paises> x = new HashSet<>();

public void cargarPaises(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Paises p = new Paises();
    System.out.println("Ingresar el nombre de un país");
    p.setPaises(leer.next());
    x.add(p);
}

public void mostrarPaises(){
    ArrayList<Paises> m1 = new ArrayList<>(x);
    Collections.sort(m1, Comparador.ordenarAlfabeticamente);

    System.out.println("Lista de países ordenado alfabéticamente: ");
    System.out.println(" ");
    HashSet<Paises> ma = new HashSet<>(m1);
    for (Paises elemento : ma) {
        System.out.println(elemento);
       }
    System.out.println(" ");

}

public  void borrarPaises(){

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Iterator<Paises> it = x.iterator();
    boolean condicion = false;
    System.out.println("Ingrese un país que quieres borrar de la lista: ");
    String paise = leer.next();

    while (it.hasNext()){
       Paises aux = it.next();
       if(aux.getPaises().equals(paise)){
           it.remove();
           condicion = true;

       }




    }
    if(condicion == false){

        System.out.println("El país ingresado no está en la lista");

    }

}

public void menuPaises(){

  Scanner leer = new Scanner(System.in).useDelimiter("\n");
   int opc;

    do {
        System.out.println("------ Menú-------");
        System.out.println(" 1- Cargar paises .");
        System.out.println("2- Mostrar paises ");
        System.out.println("3- Borrar paises");
        System.out.println("4- Salir");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                cargarPaises();
                break;
            case 2:
                mostrarPaises();
                break;
            case 3:
                borrarPaises();
                break;
            default:
                System.out.println("La opción ingresada es inválida ");
                break;
        }

    }while (opc!=4);


}

}
    

