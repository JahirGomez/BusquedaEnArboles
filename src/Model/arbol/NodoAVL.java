package Model.arbol;

import Model.arbol.ListaLigada.Nodo;

public class NodoAVL extends NodoBin{
    protected int FE;
    protected NodoAVL padre;

    public NodoAVL(){}
    
    public NodoAVL(Nodo o){
        super(o);
    }
    
    public NodoAVL(Nodo o,NodoAVL i, NodoAVL d){
        super(o,d,i);
    }
    
    public NodoAVL(Nodo o,NodoAVL i, NodoAVL d, NodoAVL p){
        super(o,d,i);
        padre = p;
    }
    
    public static int altura(NodoAVL a){
       if (a == null)
           return -1;
       else
           return 1 + 
           Math.max(altura((NodoAVL)a.getIzq()), altura((NodoAVL)a.getDer()));
    }
    
    public void inOrden(){
    if(izq!=null)
        ((NodoAVL)izq).inOrden();
        System.out.println(dato + "| FE :" + FE + "->");//Raiz
        if(dato.getSiguiente()!=null){
            Nodo actual = dato.getSiguiente();
            while(actual!=null){
                System.out.println(dato + " -> ");
                actual=actual.getSiguiente();
            }
        }
        System.out.println("\n");
        if(der!=null)
            ((NodoAVL)der).inOrden();
    }
    
    public void preOrden(){
    System.out.println(dato + "| FE :" + FE);//Raiz
        if(izq!=null)
           ((NodoAVL)izq).preOrden();     
       if(der!=null)
           ((NodoAVL)der).preOrden();
    }
    
    public void posOrden(){    
        if(izq!=null)
           ((NodoAVL)izq).posOrden();     
       if(der!=null)
           ((NodoAVL)der).posOrden();
       System.out.println(dato + "| FE :" + FE);//Raiz
    }
    
    /**
     * @return the FE
     */
    public int getFE() {
        return FE;
    }

    /**
     * @param FE the FE to set
     */
    public void setFE(int FE) {
        this.FE = FE;
    }

    /**
     * @return the padre
     */
    public NodoAVL getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(NodoAVL padre) {
        this.padre = padre;
    }
    
}
