/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class Perro {
    
    private String raza;

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaList{" + "listaRazas=" + raza + '}';
    }

  public static Comparator<Perro> ordenarPorNombres = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
           return t.getRaza().compareToIgnoreCase(t1.getRaza());
        }
        
    };
    
    
}
