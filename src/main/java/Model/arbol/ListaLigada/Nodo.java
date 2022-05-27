/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.arbol.ListaLigada;

/**
 *
 * @author Jahir Gómez
 */
public class Nodo {
    public String nombreEgresado;
    public String profesion;
    public int promedio;
    protected Nodo siguiente;
    
    public Nodo(){}
    
    public Nodo(String nombreEgresado, String profesion, int promedio){
        this.nombreEgresado = nombreEgresado;
        this.profesion = profesion;
        this.promedio = promedio;
        siguiente = null;
    }
    
    public Nodo(String nombreEgresado, String profesion, int promedio, Nodo siguiente){
        this.nombreEgresado = nombreEgresado;
        this.siguiente = siguiente;
        this.promedio = promedio;
        this.profesion = profesion;
    }

    /**
     * @return the nombreEgresado
     */
    public String getNombreEgresado() {
        return nombreEgresado;
    }

    /**
     * @param nombreEgresado the nombreEgresado to set
     */
    public void setNombreEgresado(String nombreEgresado) {
        this.nombreEgresado = nombreEgresado;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    /**
     * @return the promedio
     */
    public int getPromedio() {
        return promedio;
    }

    /**
     * @param siguiente the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombreEgresado='" + getNombreEgresado() + "'" +
            ", profesion='" + getProfesion() + "'" +
            ", promedio='" + getPromedio() + "'" +
            "}\n";
    }
    
}
