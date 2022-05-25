package Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import Model.Egresado;
import Model.arbol.ArbolAVL;
import Model.arbol.NodoAVL;
import Model.arbol.ListaLigada.ListaDoble;
import Model.arbol.ListaLigada.NodoDoble;


public class CSVController {
    JFileChooser jFileChooser;
    public ListaDoble listaEgresados;
    public ArbolAVL arbol;

    public CSVController(){
        this.listaEgresados = new ListaDoble();
        //jFileChooser = new JFileChooser();
        //jFileChooser.showOpenDialog(null);
        String linea = "";
        try{
            //BufferedReader bReader = new BufferedReader(new FileReader(jFileChooser.getSelectedFile().getAbsolutePath()));
            BufferedReader bReader = new BufferedReader(new FileReader("Egresado.csv"));
            while((linea = bReader.readLine())!=null) {
                String[] Datos = linea.split(",");
                Egresado e = new Egresado(Datos[0], Datos[1], (Integer.valueOf(Datos[2])));
                listaEgresados.insertaFinal(e);
            
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        listaEgresados.imprimir();
        System.out.println("");
        String nomAux = (listaEgresados.getInicio().getNombreEgresado());
        String profAux = (listaEgresados.getInicio().getProfesion());
        int gradAux = (listaEgresados.getInicio().getPromedio());
        Egresado primero = new Egresado(nomAux, profAux, gradAux);
        this.arbol = new ArbolAVL(primero);
        this.arbol.inOrden();
    }

    public void toTree (ListaDoble a){
        NodoDoble actual = (NodoDoble) a.getInicio();
        actual = actual.getSiguiente();
        do{
            String nomAux = (String) actual.getNombreEgresado();
            String profAux = (String) actual.getProfesion();
            int gradAux = (int) actual.getPromedio();
            Egresado eg = new Egresado(nomAux, profAux, gradAux);
            arbol.insertar(eg);
            actual = actual.getSiguiente();
        }while (actual != null);
    }

}
