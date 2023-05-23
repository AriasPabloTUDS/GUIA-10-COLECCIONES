/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class RazaPerroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> crearRazaPerro() {
        ArrayList<String> razArrayList = null;
        String aux;
        int elec = 0;
        do {
            if (elec == 0) {
                System.out.println("___Cargar Raza___");
                System.out.print("Ingrese la raza: ");
                aux = leer.next();
            }

            System.out.println("1- Cargar otra Raza");
            System.out.println("2- Volver al menú principal");
            System.out.print("Elija una opción: ");
            elec = leer.nextInt();

            switch (elec) {
                case 1:
                    System.out.print("Ingrese la raza: ");
                    aux = leer.next();
                    break;
                case 2:
                    break;
            }

        } while (elec != 2);

        return razArrayList;
    }

    public void mostrarRazasPerros(ArrayList<String> razas) {
        razas.forEach((e) -> {
            System.out.println(e);
        });
    }

}
