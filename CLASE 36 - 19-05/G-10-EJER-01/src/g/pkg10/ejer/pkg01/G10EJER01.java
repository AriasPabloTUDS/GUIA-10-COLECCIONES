/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.pkg10.ejer.pkg01;

import Entidad.RazaPerro;
import Entidad.Servicio.RazaPerroServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class G10EJER01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RazaPerroServicio rps = new RazaPerroServicio();
        RazaPerro rp = new RazaPerro();

        String aux;

        int elec = 0;
        do {
            System.out.println("___Menú___");
            System.out.println("1- Cargar Perro");
            System.out.println("2- Cargar Raza");
            System.out.println("3- Salir");

            System.out.print("Elija una opción: ");
            elec = leer.nextInt();

            switch (elec) {
                case 1:
                    break;
                case 2:
                    ArrayList<String> razaLista = new ArrayList<>();
                    razaLista = rps.crearRazaPerro();
                    rp.setRaza(razaLista);
                    break;
                case 3:
                    rp.toString();
                    //rps.mostrarRazasPerros(rp.getRaza());
                    break;
            }

        } while (elec != 3);

    }
}
