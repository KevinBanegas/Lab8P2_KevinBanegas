package lab8p2_kevinbanegas;

import java.io.Serializable;

public class Ser implements Serializable {

    private String nombre;
    private int id;
    private int poder;
    private int años;
    private String raza;
    private Universo procedencia;

    private static final long SerialVersionUID = 101L;

    public Ser(String nombre, int id, int poder, int años, String raza, Universo procedencia) {
        this.nombre = nombre;
        this.id = id;
        this.poder = poder;
        this.años = años;
        this.raza = raza;
        this.procedencia = procedencia;
    }

    public Ser() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Universo getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Universo procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
