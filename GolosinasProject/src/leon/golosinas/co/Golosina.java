package leon.golosinas.co;

import javax.swing.*;

public class Golosina {
    //Atributos
    String nombre;
    String presentacion;

    //Métodos
    public String getNombre() {
        return this.nombre;
    }
    public String getPresentacion() {
        return this.presentacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void printGolosina(){
        System.out.println("La Golosina-> " + getNombre() + " viene en presentación-> " + getPresentacion() + ".");
    }
}
