package Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import Model.Egresado;
import Model.arbol.ArbolAVL;
import Model.arbol.ListaLigada.ListaDoble;
import Model.arbol.ListaLigada.NodoDoble;


public class MainController {
    JFileChooser jFileChooser;
    public ListaDoble listaEgresadosPorPromedio;
    public ArbolAVL arbolPromedios;
    public ArbolAVL arbolNombres;
    public ArbolAVL arbolProfesiones;

    public MainController(){
        this.listaEgresadosPorPromedio = new ListaDoble();
        //jFileChooser = new JFileChooser();
        //jFileChooser.showOpenDialog(null);
        String linea = "";
        try{
            //BufferedReader bReader = new BufferedReader(new FileReader(jFileChooser.getSelectedFile().getAbsolutePath()));
            BufferedReader bReader = new BufferedReader(new FileReader("Egresado.csv"));
            while((linea = bReader.readLine())!=null) {
                String[] Datos = linea.split(",");
                Egresado e = new Egresado(Datos[0], Datos[1], (Integer.valueOf(Datos[2])));
                listaEgresadosPorPromedio.insertaFinal(e);
            
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        listaEgresadosPorPromedio.imprimir();
        System.out.println("");
        String nomAux = (listaEgresadosPorPromedio.getInicio().getNombreEgresado());
        String profAux = (listaEgresadosPorPromedio.getInicio().getProfesion());
        int gradAux = (listaEgresadosPorPromedio.getInicio().getPromedio());
        Egresado e = new Egresado(nomAux, profAux, gradAux);
        ListaDoble primero = new ListaDoble();
        primero.insertaInicio(e);
        this.arbolPromedios = new ArbolAVL(primero);
        this.arbolNombres = new ArbolAVL(primero);
        this.arbolProfesiones = new ArbolAVL(primero);
    }

    public void constructorArboles (ListaDoble a) {
        NodoDoble actual = (NodoDoble) a.getInicio();
        actual = actual.getSiguiente();
        do{
            String nomAux = (String) actual.getNombreEgresado();
            String profAux = (String) actual.getProfesion();
            int gradAux = (int) actual.getPromedio();
            Egresado e = new Egresado(nomAux, profAux, gradAux);
            ListaDoble eg = new ListaDoble();
            eg.insertaInicio(e);
            arbolPromedios.insertarPrimeraVez(eg);
            arbolNombres.insertarPorNombrePrimeraVez(eg);
            arbolProfesiones.insertarPorProfesionPrimeraVez(eg);
            actual = actual.getSiguiente();
        }while (actual != null);
    }

    public void toTree (ListaDoble a){
        NodoDoble actual = (NodoDoble) a.getInicio();
        do{
            String nomAux = (String) actual.getNombreEgresado();
            String profAux = (String) actual.getProfesion();
            int gradAux = (int) actual.getPromedio();
            Egresado e = new Egresado(nomAux, profAux, gradAux);
            NodoDoble eg = new NodoDoble(e);
            arbolPromedios.insertar(eg);
            arbolNombres.insertarPorNombre(eg);
            arbolProfesiones.insertarPorProfesion(eg);
            actual = actual.getSiguiente();
        }while (actual != null);
    }

}
