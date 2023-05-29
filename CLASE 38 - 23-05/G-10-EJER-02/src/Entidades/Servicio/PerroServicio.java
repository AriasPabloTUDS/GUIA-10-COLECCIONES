/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PerroServicio {

    private final ArrayList<Perro> perroLista;

    public PerroServicio() {
        this.leer = new Scanner(System.in);
        this.perroLista = new ArrayList();
    }

    private final Scanner leer;
    private Perro p1;

    public void crearRaza() {
        int elec = 0;
        do {
            setP1(new Perro());
            System.out.print("Ingrese una raza de perro: ");
            String aux = leer.next();
            getP1().setRaza(aux);
            perroLista.add(getP1());
            
            System.out.println("Desea ingresar otra raza: ");
            System.out.println("1- SI");
            System.out.println("2- NO");
            elec = leer.nextInt();

        } while (elec != 2);
    }

    public void mostrarRazas() {
        for (Perro e : perroLista) {
            System.out.println("La raza: " + e.getRaza());
        }

    }
    
    public void borrarPerro(){
        
        System.out.print("Ingrese la raza a eliminar:");
        String razaDelet = leer.next();
        Iterator<Perro> it = perroLista.iterator();
        boolean found = false;
        while (it.hasNext()) {            
            if (it.next().getRaza().equalsIgnoreCase(razaDelet)) {
                it.remove();
                found = true;
                break;
            } 
        }
        if (found) {
                System.out.println("La raza ''"+razaDelet+"'' fue eliminada de la lista");
            } else System.out.println("La raza ''"+razaDelet+"'' no se encuentra en la lista");
    }
    
    public void ordenar(){
        Collections.sort(perroLista,Perro.ordenarPorNombres);
    }
    

    /**
     * @return the p1
     */
    public Perro getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Perro p1) {
        this.p1 = p1;
    }

}
