package Model.arbol;

import Model.arbol.ListaLigada.ListaDoble;
import Model.arbol.ListaLigada.NodoDoble;

public class Lista {
    public static ListaDoble ingresados;

    public Lista()
    {
       ingresados = new ListaDoble();
    }
    public boolean buscarPorNombre(int valor) {
        boolean esta = false;
        NodoDoble actual = (NodoDoble) this.ingresados.getInicio();
        do{
            if (actual.getNombreEgresado().equals(valor)){
                esta = true;
                break;
            }
            actual = actual.getSiguiente();
        } while (!actual.equals(this.ingresados.getUltimo()));
        return esta;
        
    }

    public boolean buscarPorPromedio(int valor) {
        boolean esta = false;
        NodoDoble actual = (NodoDoble) this.ingresados.getInicio();
        do{
            if (actual.getPromedio().equals(valor)){
                 esta = true;
            }
            actual = actual.getSiguiente();
        } while (!actual.equals(this.ingresados.getUltimo()));
        return esta;
        
    }
}

