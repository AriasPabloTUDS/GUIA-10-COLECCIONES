/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.pkg10.ejer.pkg04;

import Entidad.Servicio.PeliculaService;

/**
 *
 * @author Pablo
 */
public class G10EJER04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PeliculaService ps = new PeliculaService();
        
        ps.creacion();
        ps.mostrar();
        ps.duracionMayor();
        System.out.println("");
        ps.ordenarDuracionDeMayorAMenor();
        System.out.println("");
        ps.ordenarDuracionDeMenorAMayor();
        System.out.println("");
        ps.ordenarTitulo();
        System.out.println("");
        ps.ordenarDirector();

    }
}
