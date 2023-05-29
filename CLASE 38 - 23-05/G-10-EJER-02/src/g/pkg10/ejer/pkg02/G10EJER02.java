/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package g.pkg10.ejer.pkg02;

import Entidades.Servicio.PerroServicio;

/**
 *
 * @author Pablo
 */
public class G10EJER02 {

    private static Object razaList2;

    public static void main(String[] args) {
        // TODO code application logic here

        PerroServicio ps = new PerroServicio();

        ps.crearRaza();
        System.out.println("Mostrar razas");
        ps.mostrarRazas();
        System.out.println("Eliminar");
        ps.borrarPerro();
        System.out.println("Mostrar razas");
        ps.mostrarRazas();
        System.out.println("Ordenar con Comparator");
        ps.ordenar();
        System.out.println("Mostrar razas");
        ps.mostrarRazas();
       

        
    }
}
