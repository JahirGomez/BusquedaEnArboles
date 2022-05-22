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
public class NodoDoble extends Nodo{
    protected NodoDoble siguiente;
    protected NodoDoble anterior;
    
    public NodoDoble(){}
    
    public NodoDoble(Object nombreEgresado, NodoDoble siguiente, NodoDoble anterior){
        this.nombreEgresado = nombreEgresado;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NodoDoble(Object nombreEgresado){
        this.nombreEgresado = nombreEgresado;
        siguiente = anterior = null;
    }

    /**
     * @return the siguiente
     */
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
    
}
