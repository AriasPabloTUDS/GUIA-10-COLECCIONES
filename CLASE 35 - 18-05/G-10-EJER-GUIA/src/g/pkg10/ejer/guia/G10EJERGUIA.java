/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.pkg10.ejer.guia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Pablo
 */
public class G10EJERGUIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        MANOS A LA OBRA – DETECCIÓN DE ERRORES
//        Corrige el siguiente código:
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> colec = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        System.out.println("__________Lista____________");
//        Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        listado.add(3);
        listado.add(5);
        listado.add(3);
        listado.add(1);//Se pueden repetir datos
        listado.add(2);//Los datos no se ordenan

        System.out.println(listado);

        listado.remove(2);

        for (int i = 0; i < listado.size(); i++) {
            System.out.println("p" + i + " " + listado);

        }
        System.out.println("__________TreSet___________");

        colec.add("Cristian");
        colec.add("Carlos");//se repite por lo tanto no figura
        colec.add("Noelia");
        colec.add("Yamila");
        colec.add("Dario");//Se ordenan los datos

        System.out.println(colec);

        colec.remove("Dario");
        for (int i = 0; i < colec.size(); i++) {
            System.out.println("p" + i + " " + colec);

        }

        System.out.println("_________HashMap___________");
        personas.put(1, "Pibu");
        personas.put(2, "Boni");
        personas.put(3, "Skip");
        personas.put(4, "Pibu");//Se pueden repetir datos
        personas.put(5, "Nino");//No se ordenan

        System.out.println(personas);

        personas.remove(2);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println("p" + i + " " + personas);

        }
        System.out.println("__________________________________");

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        System.out.println(bebidas);
        
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals("café")) {
                it.remove();
            }
        }
        System.out.println(bebidas);
    }
}
