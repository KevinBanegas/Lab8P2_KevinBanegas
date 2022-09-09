package lab8p2_kevinbanegas;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private ArrayList<Ser> seres = new ArrayList();
    private int size;

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public Universo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ser> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Ser> seres) {
        this.seres = seres;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = seres.size();
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", seres=" + seres + '}';
    }
    
    
}
