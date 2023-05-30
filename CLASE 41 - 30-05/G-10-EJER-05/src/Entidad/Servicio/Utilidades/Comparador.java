/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio.Utilidades;

import Entidad.Paises;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class Comparador {
    
    public static Comparator <Paises> ordenarAlfabeticamente = new Comparator<Paises>() {
        @Override
        public int compare(Paises o1, Paises o2) {
            return o1.getPaises().compareTo(o2.getPaises());
        }
    };
    
}
