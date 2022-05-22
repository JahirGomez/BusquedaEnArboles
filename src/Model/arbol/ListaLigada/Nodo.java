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
    protected Object nombreEgresado;
    protected Object promedio;
    protected Nodo siguiente;
    
    public Nodo(){}
    
    public Nodo(Object nombreEgresado){
        this.nombreEgresado = nombreEgresado;
        siguiente = null;
    }
    
    public Nodo(Object nombreEgresado, Nodo siguiente, Object promedio){
        this.nombreEgresado = nombreEgresado;
        this.siguiente = siguiente;
        this.promedio = promedio;
    }

    /**
     * @return the nombreEgresado
     */
    public Object getNombreEgresado() {
        return nombreEgresado;
    }

    /**
     * @param nombreEgresado the nombreEgresado to set
     */
    public void setNombreEgresado(Object nombreEgresado) {
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
    public Object getPromedio() {
        return promedio;
    }

    /**
     * @param siguiente the promedio to set
     */
    public void setPromedio(Nodo siguiente) {
        this.promedio = promedio;
    }
    
}
