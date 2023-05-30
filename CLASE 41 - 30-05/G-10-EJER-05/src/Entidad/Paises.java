/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Paises {
    private String paises;

    public Paises() {
    }

    public Paises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "paises='" + paises + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paises paises1 = (Paises) o;

        return paises.equals(paises1.paises);
    }

    @Override
    public int hashCode() {
        return paises.hashCode();
    }

    
}
