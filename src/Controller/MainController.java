package Controller;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFileChooser;

import Model.arbol.ListaLigada.ListaDoble;

public class MainController {
    JFileChooser jFileChooser;

    public MainController(){
        jFileChooser = new JFileChooser();
        jFileChooser.showOpenDialog(null);
        String linea = "";
        try{
            BufferedReader bReader = new BufferedReader(new FileReader(jFileChooser.getSelectedFile().getAbsolutePath());
            while(!(linea = bReader.readLine()).equals(null)) {
                String[] Datos = linea.split(",");
            }
        }
    }

    public ListaDoble lista = new ListaDoble();
}
