package lab8p2_kevinbanegas;

import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable{
    private String nombre;
    private ArrayList<Ser> seres = new ArrayList();
    private int size;
    
    private static final long SerialVersionUID = 102L; 
    
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
        return nombre;
    }
    
    
}
