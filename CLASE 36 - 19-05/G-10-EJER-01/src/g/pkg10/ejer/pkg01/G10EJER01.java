/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
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
        
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razaList = new ArrayList();
        int elec = 0;

        do {  
            System.out.print("Ingrese una raza de perro: ");
            String aux = leer.next();
            razaList.add(aux);
            
            System.out.println("Desea ingresar otra raza: ");
            System.out.println("1- SI");
            System.out.println("2- NO");
            elec = leer.nextInt();
            
        } while (elec !=2);
         
        for (String razaString : razaList) {
            System.out.println(razaString);
        }
        
    }
}
