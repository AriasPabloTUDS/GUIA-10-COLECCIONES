/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class RazaPerro {
    private ArrayList<String> raza;

    public RazaPerro() {
    }

    public RazaPerro(ArrayList<String> raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPerro{" + "raza=" + raza + '}';
    }

    
    
    
    

    }
    
    
    
    


