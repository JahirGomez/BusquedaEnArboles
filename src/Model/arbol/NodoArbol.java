package Model.arbol;

public class NodoArbol {
    public int []valores;
    public NodoArbol []nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public NodoArbol padre;

    public NodoArbol(){
       nodo = new NodoArbol [Raiz.grado * 2 + 3];
       valores = new int [Raiz.grado * 2 + 1];
    }
}
