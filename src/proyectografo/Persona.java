package proyectografo;

import java.io.Serializable;
import java.util.ArrayList;

public class Persona implements Serializable {

    String nombre;
    Peso amistad;
    ArrayList<Object[]> lista = new ArrayList<Object[]>();

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Peso getAmistad() {
        return amistad;
    }

    public void setAmistad(Peso amistad) {
        this.amistad = amistad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Object[]> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Object[]> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
